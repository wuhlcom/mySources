/** 
* @author :wuhongliang wuhongliang@zhilutec.com
* @version :2017年10月19日 下午3:19:57 * 
*/
package socket.sockets;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

/** 模拟水表发送数据 **/
public class WaterUDPClient {
	private static final int TIMEOUT = 5000; // 设置接收数据的超时时间
	public static void main(String args[]) throws IOException {
		// `dev_address` varchar(20) NOT NULL,
		// `dev_type` tinyint(2) DEFAULT NULL,
		// `positive_flow` decimal(18,8) DEFAULT NULL COMMENT '正累计流量 单位立方米',
		// `negative_flow` decimal(18,8) DEFAULT NULL COMMENT '负累计流量 单位立方米',
		// `realy_time` varchar(16) DEFAULT NULL COMMENT '统计时间',
		System.out.println("Water begining .........");
		@SuppressWarnings("resource")
		DatagramSocket ds = new DatagramSocket(6665);
		InetAddress addr = InetAddress.getByName("119.29.152.124");
		while (true) {
			try {
				String str_send = "{\"dev_address\":\"11110086512001\",\"dev_type\":2,\"positive_flow\":3.80000000,\"negative_flow\":2.14000000,\"realy_time\":"
						+ "\""+genRealTime()+"\"" + "}";

				System.out.println("data==>"+str_send);
				// 定义用来发送数据的DatagramPacket实例
				DatagramPacket dp_send = new DatagramPacket(str_send.getBytes(), str_send.length(), addr, 6666);

				ds.setSoTimeout(TIMEOUT); // 设置接收数据时阻塞的最长时间
				// 发送数据
				ds.send(dp_send);
				Thread.currentThread().sleep(1000 * 60);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// ds.close();
	}

	public static String genRealTime() {
		Date d = new Date();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMddHHmmss");
		String dateNowStr2 = sdf2.format(d);
		return "00" + dateNowStr2;
	}
}