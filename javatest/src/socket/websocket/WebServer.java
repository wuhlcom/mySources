package socket.websocket;

import java.io.ByteArrayInputStream;  
import java.io.IOException;  
import java.io.InputStream;  
import java.io.InputStreamReader;  
import java.io.OutputStream;  
import java.io.PrintWriter;  
import java.net.ServerSocket;  
import java.net.Socket;  
import java.nio.ByteBuffer;  
import java.nio.charset.Charset;  
import java.security.MessageDigest;  
import java.util.ArrayList;  
import java.util.List;  
  
import javax.swing.JTextArea;  
/** 
  * @author(作者) :Cx 
 */  
public class WebServer {  
    private int port = 8888;  
    private ServerSocket serverSocket;  
    private List<Handler> handlers = new ArrayList<Handler>();  
    JTextArea text;//显示信息  
   
    public WebServer(JTextArea text) throws IOException {  
        this.text = text;  
        serverSocket = new ServerSocket(port);  
        text.setText("WebSocket服务器已启动!\n");  
        text.append("等待客户端连接...!\n");  
    }  
   
    public void service() {  
        Socket socket = null;  
        while (true) {  
            try {  
                //接收socket请求  
                socket = serverSocket.accept();  
                //判断  
                if(handlers.size()>0){  
                    for (Handler handler : handlers) {  
                        if(handler.getSpeech()!=null){  
                            handler.getSpeech().flag=false;  
                        }  
                    }  
                    handlers.clear();  
                }  
                //开启线程，接收不同的socket请求  
                Handler handler = new Handler(socket);  
                handlers.add(handler);  
                Thread workThread = new Thread(handler);  
                workThread.start();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
   
    class Handler implements Runnable {  
        private Speech speech = new Speech();  
        private Socket socket;  
        private boolean hasHandshake = false;  
        Charset charset = Charset.forName("UTF-8");    
          
        public Speech getSpeech(){  
            return this.speech;  
        }  
          
        public Handler(Socket socket) {  
            this.socket = socket;  
        }  
   
        private PrintWriter getWriter(Socket socket) throws IOException {  
            OutputStream socketOut = socket.getOutputStream();  
            return new PrintWriter(socketOut, true);  
        }  
        public void run() {  
            try {  
                System.out.println("New connection accepted"  
                        + socket.getInetAddress() + ":" + socket.getPort());  
                text.append("New connection accepted!.."+socket.getInetAddress()+":"+socket.getPort()+"\n");  
                text.setCaretPosition(text.getText().length());  
                //获取socket输入流信息  
                InputStream in = socket.getInputStream();  
                //获取socket输出  
                PrintWriter pw = getWriter(socket);  
                //读入缓存(定义一个1M的缓存区)  
                byte[] buf = new byte[1024];  
                //读到字节（读取输入流数据到缓存）  
                int len = in.read(buf, 0, 1024);  
                //读到字节数组（定义一个容纳数据大小合适缓存区）  
                byte[] res = new byte[len];  
                //将buf内中数据拷贝到res中  
                System.arraycopy(buf, 0, res, 0, len);  
                //打印res缓存内容  
                String key = new String(res);  
                if(!hasHandshake && key.indexOf("Key") > 0){  
                    //握手  
                    //通过字符串截取获取key值  
                    key = key.substring(0, key.indexOf("==") + 2);  
                    key = key.substring(key.indexOf("Key") + 4, key.length()).trim();  
                    //拼接WEBSOCKET传输协议的安全校验字符串  
                    key+= "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";  
                    //通过SHA-1算法进行更新  
                    MessageDigest md = MessageDigest.getInstance("SHA-1");    
                    md.update(key.getBytes("utf-8"), 0, key.length());  
                    byte[] sha1Hash = md.digest();    
                    //进行Base64加密  
//                    sun.misc.BASE64Encoder encoder = new sun.misc.BASE64Encoder();    
//                    key = encoder.encode(sha1Hash);    
                    
                    //服务器端返回输出内容  
                    pw.println("HTTP/1.1 101 Switching Protocols");  
                    pw.println("Upgrade: socket.websocket");
                    pw.println("Connection: Upgrade");  
                    pw.println("Sec-WebSocket-Accept: " + key);  
                    pw.println();  
                    pw.flush();  
                    //将握手标志更新，只握一次  
                    hasHandshake = true;  
                    //服务器返回成功，---握手协议完成，进行TCP通信  
                    //进行语音交互  
                    //当时做语音时用到的  
                    speech.verifySocket(this);  
                    //----------------------以下是获取到浏览器发送的消息--------  
                    //接收数据  
                    byte[] first = new byte[1];  
                    //这里会阻塞  
                    int read = in.read(first, 0, 1);  
                    //读取第一个字节是否有值,开始接收数据  
                    while(read > 0){  
                        //让byte和十六进制做与运算（二进制也就是11111111）  
                        //获取到第一个字节的数值  
                        int b = first[0] & 0xFF;  
                        //1为字符数据，8为关闭socket（只要低四位的值判断）  
                        byte opCode = (byte) (b & 0x0F);  
                        if(opCode == 8){  
                            socket.getOutputStream().close();  
                            break;  
                        }  
                        b = in.read();  
                        //只能描述127  
                        int payloadLength = b & 0x7F;  
                        if (payloadLength == 126) {  
                            byte[] extended = new byte[2];  
                            in.read(extended, 0, 2);  
                            int shift = 0;  
                            payloadLength = 0;  
                            for (int i = extended.length - 1; i >= 0; i--) {  
                                payloadLength = payloadLength + ((extended[i] & 0xFF) << shift);  
                                shift += 2;  
                            }  
                        } else if (payloadLength == 127) {  
                            byte[] extended = new byte[8];  
                            in.read(extended, 0, 8);  
                            int shift = 0;  
                            payloadLength = 0;  
                            for (int i = extended.length - 1; i >= 0; i--) {  
                                payloadLength = payloadLength + ((extended[i] & 0xFF) << shift);  
                                shift += 8;  
                            }  
                        }  
                        //掩码  
                        byte[] mask = new byte[4];  
                        in.read(mask, 0, 4);  
                        int readThisFragment = 1;  
                        ByteBuffer byteBuf = ByteBuffer.allocate(payloadLength + 30);  
                        byteBuf.put("浏览器: ".getBytes("UTF-8"));  
                        while(payloadLength > 0){  
                             int masked = in.read();  
                             masked = masked ^ (mask[(int) ((readThisFragment - 1) % 4)] & 0xFF);  
                             byteBuf.put((byte) masked);  
                             payloadLength--;  
                             readThisFragment++;  
                        }  
                        byteBuf.flip();  
                        //将内容返回给客户端  
                        responseClient(byteBuf, true);  
                        //打印内容  
                        printRes(byteBuf.array());  
                        in.read(first, 0, 1);  
                    }  
                }  
                in.close();  
            } catch (Exception e) {  
                e.printStackTrace();  
            } finally {  
                System.out.println("*********************废弃Socket回收阶段******************！");  
                try {  
                    if (socket != null){  
                        socket.close();  
                    }  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
   
        public void responseClient(ByteBuffer byteBuf, boolean finalFragment) throws IOException {  
            OutputStream out = socket.getOutputStream();  
            int first = 0x00;  
            //是否是输出最后的WebSocket响应片段  
                if (finalFragment) {  
                    first = first + 0x80;  
                    first = first + 0x1;  
                }  
                out.write(first);  
                if (byteBuf.limit() < 126) {  
                    out.write(byteBuf.limit());  
                } else if (byteBuf.limit() < 65536) {  
                out.write(126);  
                out.write(byteBuf.limit() >>> 8);  
                out.write(byteBuf.limit() & 0xFF);  
                } else {  
                // Will never be more than 2^31-1  
                out.write(127);  
                out.write(0);  
                out.write(0);  
                out.write(0);  
                out.write(0);  
                out.write(byteBuf.limit() >>> 24);  
                out.write(byteBuf.limit() >>> 16);  
                out.write(byteBuf.limit() >>> 8);  
                out.write(byteBuf.limit() & 0xFF);  
                }  
                // Write the content  
                out.write(byteBuf.array(), 0, byteBuf.limit());  
                out.flush();  
        }  
           
        private void printRes(byte[] array) {  
            ByteArrayInputStream  byteIn = new ByteArrayInputStream(array);  
            InputStreamReader reader = new InputStreamReader(byteIn, charset.newDecoder());  
            int b = 0;  
            String res = "";  
            try {  
                while((b = reader.read()) > 0){  
                    res += (char)b;  
                }  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
            System.out.println(res);  
        }  
    }  
}  