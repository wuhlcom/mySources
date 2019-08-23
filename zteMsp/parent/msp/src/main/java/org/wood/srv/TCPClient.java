package org.wood.srv;

import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Random;

/**
 * test
 */
public class TCPClient {

    private static final String appeui = "2c26c5007e000010";
    private static final String appauthkey = "00112233445566778899aabbccddeeff";

    public static void main(String[] args) throws Exception {
        Socket s = new Socket("139.129.216.128", 30003);
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        byte[] sendByte = AesCmacTool.parseHexStr2Byte(getSendMsg());
        dos.write(sendByte, 0, sendByte.length);
        dos.flush();

        InputStream is = s.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        char[] cBuf = new char[1024];
        int i = 0;
        while ((i = br.read(cBuf, 0, cBuf.length)) != -1) {
            String resBodyStr = new String(cBuf);
            System.err.println("--->>>" + getResBody(resBodyStr.getBytes()));
//            cBuf = new char[1024];
        }
        dos.close();
        s.close();
    }

    // 获取发送的信息
    public static String getSendMsg() throws Exception {
        // 生成挑战字
        int appnonce = getAppnonce();
        AesCmacTool mac = new AesCmacTool();
        String ckey = mac.genChallengeKey(appauthkey, appeui, appnonce);

        JSONObject jsonObj = new JSONObject();
        jsonObj.put("cmd", "join");
        jsonObj.put("cmdseq", 12);
        jsonObj.put("appeui", appeui);
        jsonObj.put("appnonce", appnonce);
        jsonObj.put("challenge", ckey);

        String msgBodyHex = strTo16(jsonObj.toJSONString());
        String msgHeadHex = "0A" + "0102" + getMsgLenHex(msgBodyHex);
        String msgEnd = "00";
        String msgHex = msgHeadHex + msgBodyHex + msgEnd;
        return msgHex.toUpperCase();
    }

    // 生成随机数
    public static int getAppnonce() {
        int start = 1;   //定义范围开始数字
        int end = (int) Math.pow(2, 32) - 1; //定义范围结束数字
        //创建Random类对象
        Random random = new Random();
        //产生随机数
        return random.nextInt(end - start + 1) + start;
    }

    // 获取消息长度十六进制字符串
    public static String getMsgLenHex(String msgBodyHex) {
        String msgLenHex = Integer.toHexString(msgBodyHex.length() / 2 + 1);
        return 2 == msgLenHex.length() / 2 ? msgLenHex : "00" + msgLenHex;
    }

    // 字符串转十六进制字符串
    public static String strTo16(String s) {
        char[] chars = "0123456789ABCDEF".toCharArray();
        StringBuilder sb = new StringBuilder("");
        byte[] bs = s.getBytes();
        int bit;
        for (int i = 0; i < bs.length; i++) {
            bit = (bs[i] & 0x0f0) >> 4;
            sb.append(chars[bit]);
            bit = bs[i] & 0x0f;
            sb.append(chars[bit]);
        }
        return sb.toString().trim();
    }

    // 获取响应消息字符串
    public static String getResBody(byte[] resByte) {
        byte[] bodyLenByte = new byte[2];
        System.arraycopy(resByte, 3, bodyLenByte, 0, 2);
        int bodyLenInt = byteArrayToInt(bodyLenByte) - 1;// 最后一位为\0
        byte[] bodyByte = new byte[bodyLenInt];
        System.arraycopy(resByte, 5, bodyByte, 0, bodyLenInt);
        return new String(bodyByte);
    }

    /**
     * byte[]转int
     *
     * @param bytes 需要转换成int的数组
     * @return int值
     */
    public static int byteArrayToInt(byte[] bytes) {
        return Integer.valueOf(AesCmacTool.parseByte2HexStr(bytes), 16);
    }

}
