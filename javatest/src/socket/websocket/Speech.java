package socket.websocket;

import socket.websocket.WebServer.Handler;

import java.nio.ByteBuffer;
  
/** 
  * @author(作者) :Cx 
 */  
public class Speech {  
    Boolean flag = true;  
    //加上锁，只允许一个网页连接进行交互。  
    public synchronized   void verifySocket(Handler handle) throws Exception{
        String rec =null;  
        while (flag) {  
               Thread.sleep(10);  
//               rec = WebRecorder.recData;  
                if(rec !=null){  
                    synchronized(rec) {
                    ByteBuffer byteBuf = ByteBuffer.allocate(30);  
                    byteBuf.put(rec.getBytes("UTF-8"));  
                    handle.responseClient(byteBuf, true);  
                    System.out.println("返回成功"+rec);  
//                    WebRecorder.recData=null;  
                }  
            }     
        }  
    }  
}  