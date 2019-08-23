package zhilutec.utils;

import java.util.Random;

/**
 * 主要用于作字符串转16进制，字节转16进制
 */
public class MspPacketUtil {

    // 生成随机数，用于计算挑战字
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
        return Integer.valueOf(parseByte2HexStr(bytes), 16);
    }


    /**
     * 将16进制转换为二进制
     *
     * @param hexStr
     * @return
     * @throws
     * @method parseHexStr2Byte
     * @since v1.0
     */
    public static byte[] parseHexStr2Byte(String hexStr) {
        if (hexStr.length() < 1) {
            return null;
        }
        byte[] result = new byte[hexStr.length() / 2];
        for (int i = 0; i < hexStr.length() / 2; i++) {
            int high = Integer.parseInt(hexStr.substring(i * 2, i * 2 + 1), 16);
            int low = Integer.parseInt(hexStr.substring(i * 2 + 1, i * 2 + 2), 16);
            result[i] = (byte) (high * 16 + low);
        }
        return result;
    }


    /**
     * 将二进制转换成16进制（大写字符）
     *
     * @param buf
     * @return
     * @throws
     * @method parseByte2HexStr
     * @since v1.0
     */
    public static String parseByte2HexStr(byte buf[]) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < buf.length; i++) {
            String hex = Integer.toHexString(buf[i] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            sb.append(hex.toUpperCase());
        }
        return sb.toString();
    }



}
