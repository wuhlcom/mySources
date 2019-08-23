/**
 * 挑战字生成工具（基于AES CMAC加密算法产生）。
 *
 * 适用于jdk1.6及以上版本。
 * 工具提供者：中兴克拉（CLAA联盟）。
 */
package org.wood.srv;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * @author zteclaa
 *
 */
public class AesCmacTool {

    private static final IvParameterSpec ZERO_IV = new IvParameterSpec(new byte[16]);
    private static final byte CONSTANT = (byte) 0x87;
    private static final int BLOCK_SIZE = 16;

    private int macLength;
    private Cipher aesCipher;

    private byte[] buffer;
    private int bufferCount;

    private byte[] k1;
    private byte[] k2;

    /**
     * 默认构建器
     *
     * @throws NoSuchAlgorithmException
     */
    public AesCmacTool() throws NoSuchAlgorithmException {
        this(BLOCK_SIZE);
    }

    /**
     * 构建器
     *
     * @param length
     * @throws NoSuchAlgorithmException
     */
    public AesCmacTool(int length) throws NoSuchAlgorithmException {
        if (length > BLOCK_SIZE) {
            System.out.println("AES CMAC maximum length is " + BLOCK_SIZE);
            throw new NoSuchAlgorithmException("AES CMAC maximum length is " + BLOCK_SIZE);
        }
        try {
            macLength = length;
            aesCipher = Cipher.getInstance("AES/CBC/NOPADDING");
            buffer = new byte[BLOCK_SIZE];
        } catch (NoSuchPaddingException nspe) {
            System.out.println("AesCmac init failed: " + nspe.getMessage());
            nspe.printStackTrace();
        }
    }

    /**
     * doubleSubKey
     *
     * @param k
     * @return
     */
    private byte[] doubleSubKey(byte[] k) {
        byte[] ret = new byte[k.length];
        boolean firstBitSet = ((k[0] & 0x80) != 0);
        for (int i = 0; i < k.length; i++) {
            ret[i] = (byte) (k[i] << 1);
            if (i + 1 < k.length && ((k[i + 1] & 0x80) != 0)) {
                ret[i] |= 0x01;
            }
        }
        if (firstBitSet) {
            ret[ret.length - 1] ^= CONSTANT;
        }
        return ret;
    }

    /**
     * 初始化
     *
     * @param key
     * @param enMode
     * @throws Exception
     */
    private final void init(Key key, int enMode) throws Exception {
        if (!(key instanceof SecretKeySpec)) {
            throw new InvalidKeyException("Key is not of required type SecretKey.");
        }
        if (!((SecretKeySpec) key).getAlgorithm().equals("AES")) {
            throw new InvalidKeyException("Key is not an AES key.");
        }
        aesCipher.init(enMode, key, ZERO_IV);

        // First calculate k0 from zero bytes
        byte[] k0 = new byte[BLOCK_SIZE];
        try {
            aesCipher.update(k0, 0, k0.length, k0, 0);
        } catch (ShortBufferException sbe) {
        }

        // Calculate values for k1 and k2
        k1 = doubleSubKey(k0);
        k2 = doubleSubKey(k1);

        aesCipher.init(enMode, key, ZERO_IV);
        bufferCount = 0;
    }

    /**
     * updateBlock
     *
     * @param data
     */
    private final void updateBlock(byte[] data) {
        int currentOffset = 0;
        if (data.length < BLOCK_SIZE - bufferCount) {
            System.arraycopy(data, 0, buffer, bufferCount, data.length);
            bufferCount += data.length;
            return;
        } else if (bufferCount > 0) {
            System.arraycopy(data, 0, buffer, bufferCount, BLOCK_SIZE - bufferCount);
            try {
                aesCipher.update(buffer, 0, BLOCK_SIZE, buffer, 0);
            } catch (ShortBufferException sbe) {
                System.out.println("updateBlock failed: " + sbe.getMessage());
                sbe.printStackTrace();
            }
            currentOffset += BLOCK_SIZE - bufferCount;
            bufferCount = 0;
        }
        // Transform all the full blocks in data
        while (currentOffset + BLOCK_SIZE < data.length) {
            try {
                aesCipher.update(data, currentOffset, BLOCK_SIZE, buffer, 0);
            } catch (ShortBufferException sbe) {
                System.out.println("updateBlock failed: " + sbe.getMessage());
                sbe.printStackTrace();
            }
            currentOffset += BLOCK_SIZE;
        }
        // Save the leftover bytes to buffer
        if (currentOffset != data.length) {
            System.arraycopy(data, currentOffset, buffer, 0, data.length - currentOffset);
            bufferCount = data.length - currentOffset;
        }
    }

    /**
     * doFinal
     *
     * @return
     */
    private final byte[] doFinal() {
        byte[] subKey = k1;
        if (bufferCount < BLOCK_SIZE) {
            // Add padding and XOR with k2 instead
            buffer[bufferCount] = (byte) 0x80;
            for (int i = bufferCount + 1; i < BLOCK_SIZE; i++) {
                buffer[i] = (byte) 0x00;
            }
            subKey = k2;
        }
        for (int i = 0; i < BLOCK_SIZE; i++) {
            buffer[i] ^= subKey[i];
        }
        // Calculate the final CMAC calue
        try {
            aesCipher.doFinal(buffer, 0, BLOCK_SIZE, buffer, 0);
        } // These should never happen because we pad manually
        catch (ShortBufferException sbe) {
            System.out.println("doFinal failed: " + sbe.getMessage());
            sbe.printStackTrace();
        } catch (IllegalBlockSizeException ibse) {
            System.out.println("doFinal failed: " + ibse.getMessage());
            ibse.printStackTrace();
        } catch (BadPaddingException ibse) {
            System.out.println("doFinal failed: " + ibse.getMessage());
            ibse.printStackTrace();
        }
        bufferCount = 0;
        byte[] mac = new byte[macLength];
        System.arraycopy(buffer, 0, mac, 0, macLength);
        return mac;
    }

    /**
     * calculateHash
     *
     * @param data
     * @return
     */
    public final byte[] calculateHash(byte[] data) {
        updateBlock(data);
        return doFinal();
    }

    /**
     * 将二进制转换成16进制（大写字符）
     *
     * @method parseByte2HexStr
     * @param buf
     * @return
     * @throws
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

    /**
     * 将16进制转换为二进制
     *
     * @method parseHexStr2Byte
     * @param hexStr
     * @return
     * @throws
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
     * 根据eui和appnonce计算update byte[]
     *
     * @param appeui （16进制字符串，16个字符）
     * @param appnonce （16进制字符串，8个字符）
     * @return
     */
    private byte[] genUpdateBytes(String appeui, String appnonce) {
        byte[] ret = new byte[16];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = 0;
        }
        // appeui = 0200000000001211（16进制字符串）
        // appnonce = 11223344（16进制字符串）
        // 目标顺序：appeui-appnonce-0： 0200000000001211-11223344-00000000
        byte[] euiBs = parseHexStr2Byte(appeui);
        byte[] nonceBs = parseHexStr2Byte(appnonce);
        //按大字节序存放EUI
        for (int i = 0; i < 8; i++) {
            ret[i] = (byte) (euiBs[i] & 0xFF);
        }
        // 设置noncebs
        for (int i = 0; i < nonceBs.length; i++) {
            ret[8 + i] = (byte) (nonceBs[i] & 0xFF);
        }
        return ret;
    }

    /**
     * 产生挑战字（16进制字符串，长度32）
     *
     * @param appAuthKey -- 16进制字符串（长度=32），e.g. A2345678901234B612345678901234C6
     * @param appEUI -- 16进制字符串（长度<=16）， e.g. 0021B6890091D198 @param nonce --
     * 随机数 @ return 挑战字（16进制字符串，长度32）
     * @throw
     * s
     * Exception
     */
    public String genChallengeKey(String appAuthKey, String appEUI, int nonce) throws Exception {
        if (appAuthKey == null || appAuthKey.trim().length() != 32) {
            System.out.println("hexKey format is invalid(it should be 32 hex-chars): " + appAuthKey);
            throw new Exception("hexKey format is invalid(it should be 32 hex-chars): " + appAuthKey);
        }
        appAuthKey = appAuthKey.trim();
        if (appEUI == null || appEUI.trim().equals("")) {
            throw new Exception("appEUI format is invalid(it should be 16 hex-chars): " + appEUI);
        }
        int appEuiLen = appEUI.length();
        int diffNum = 16 - appEuiLen;
        for (int i = 0; i < diffNum; i++) {
            // 不足16个字符的，前边补0.
            appEUI = "0" + appEUI;
        }
        System.out.println("appEUI: " + appEUI);
        long nonceLongVal = Integer.toUnsignedLong(nonce);
        String nonceHexStr = Long.toHexString(nonceLongVal);
        int nonceLen = nonceHexStr.length();
        if (nonceLen > 8) {
            System.out.println("nonce is too long!");
            nonceHexStr = nonceHexStr.substring(0, 8);
        } else {
            diffNum = 8 - nonceLen;
            for (int i = 0; i < diffNum; i++) {
                // 不足8个字符的，前边补0.
                nonceHexStr = "0" + nonceHexStr;
            }
        }
        System.out.println("nonceHexStr: " + nonceHexStr);
        //e.g. appEUI = "0200000000001211"; nonceHexStr = "0022A340";
        byte[] input = this.genUpdateBytes(appEUI, nonceHexStr);
        byte[] masterKey = AesCmacTool.parseHexStr2Byte(appAuthKey);
        SecretKey key = new SecretKeySpec(masterKey, "AES");
        AesCmacTool mac = new AesCmacTool();
        //set master key
        mac.init(key, Cipher.ENCRYPT_MODE);
        //given input
        mac.updateBlock(input);
        byte[] orgRet = mac.doFinal();
        // 按小字节序转换打印
        int len = orgRet.length;
        byte[] ret = new byte[len];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = orgRet[len - 1 - i];
        }
        String retStr = parseByte2HexStr(ret);
        // System.out.println("ChallengeKey = "+retStr);		    
        return retStr;
    }

    /**
     * 测试及用法.
     *
     * @param args
     */
    public static void main(String[] args) {
        // 使用方法实例
        try {
            String authKey = "00112233445566778899AABBCCDDEEFF";
            String appEui = "1122334455667788";
            int nonce = 2069243328;
            AesCmacTool mac = new AesCmacTool();
            String ckey = mac.genChallengeKey(authKey, appEui, nonce);
            System.out.println("ChallengeKey = " + ckey);
            System.out.println("Target geKey = C10D5CE173127629A327E25BCA122D8C");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
