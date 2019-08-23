package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * 判断网络连接状况.
 *
 */
public class NetState {

    public boolean isConnect(String addr,int count){
        boolean connect = false;
        Runtime runtime = Runtime.getRuntime();
        Process process;
        try {
            process = runtime.exec("ping " + "-n "+count+" "+addr);
            InputStream is = process.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, Charset.forName("GBK"));
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            StringBuffer sb = new StringBuffer();
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            // byte[] b = sb.toString().getBytes("utf-8");
            // System.out.println("返回值为:"+new String(b,"gbk"));
            System.out.println("返回值为:"+sb.toString());
            is.close();
            isr.close();
            br.close();

            if (null != sb && !sb.toString().equals("")) {
                String logString = "";
                if (sb.toString().indexOf("TTL") > 0) {
                    // 网络畅通
                    connect = true;
                } else {
                    // 网络不畅通
                    connect = false;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return connect;
    }

    public static void main(String[] args) {
        NetState netState = new NetState();
        System.out.println(netState.isConnect("www.baidu.com",3));

    }
}