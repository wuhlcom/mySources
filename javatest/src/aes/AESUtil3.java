package aes;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.Security;

;

public class AESUtil3 {


    /** 默认密钥，实际项目中可配置注入或数据库读取 */
    private static String DEFAULT_KEY = "z0!22&Op!~dixv-=";
    private static String DEFAULT_CHARSET="GBK";

    /** 加密工具 */
    private Cipher encryptCipher = null;

    /** 解密工具 */
    private Cipher decryptCipher = null;

    private static AESUtil3 instance = new AESUtil3(DEFAULT_KEY);

    public static AESUtil3 getInstance() {
        return instance;
    }

    private AESUtil3(String keyvalue){
        Security.addProvider(new com.sun.crypto.provider.SunJCE());
        if(keyvalue==null)
            keyvalue=DEFAULT_KEY;
        byte[] arrBTmp=null;
        try {
            arrBTmp = keyvalue.getBytes(DEFAULT_CHARSET);
        } catch (UnsupportedEncodingException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        // 创建一个空的length位字节数组（默认值为0）
        byte[] arrB = new byte[16];

        // 将原始字节数组转换为8位
        for (int i = 0; i < arrBTmp.length && i < arrB.length; i++) {
            arrB[i] = arrBTmp[i];
        }
        // 生成密钥
        Key key = new javax.crypto.spec.SecretKeySpec(arrB, "AES");

        // 生成Cipher对象,指定其支持的DES算法
        try {
            encryptCipher = Cipher.getInstance("AES");
            encryptCipher.init(Cipher.ENCRYPT_MODE, key);

            decryptCipher = Cipher.getInstance("AES");
            decryptCipher.init(Cipher.DECRYPT_MODE, key);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }
    }

    /**
     * 对字符串加密
     *
     * @param str
     * @return
     * @throws InvalidKeyException
     * @throws IllegalBlockSizeException
     * @throws BadPaddingException
     */
    public byte[] encrytor(String str) throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        byte[] src = null;
        try {
            src = str.getBytes(DEFAULT_CHARSET);
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return encryptCipher.doFinal(src);
    }

    /**
     * 对字符串解密
     *
     * @param buff
     * @return
     * @throws InvalidKeyException
     * @throws IllegalBlockSizeException
     * @throws BadPaddingException
     */
    public byte[] decryptor(byte[] buff) throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        return decryptCipher.doFinal(buff);
    }

    /**
     * @param args
     * @throws NoSuchPaddingException
     * @throws NoSuchAlgorithmException
     * @throws BadPaddingException
     * @throws IllegalBlockSizeException
     * @throws InvalidKeyException
     */
    public static void main(String[] args) throws Exception {
        AESUtil3 aesUtil3 = AESUtil3.getInstance();
        //String msg = "郭德纲-搞笑相声全集";
        String msg = "123456";
        byte[] encontent = aesUtil3.encrytor(msg);
        byte[] decontent = aesUtil3.decryptor(encontent);
//		OutputStream out = new FileOutputStream("D:\\AES\\2.txt");
        //	out.write(encontent);
        //out.close();
//		InputStream in = new FileInputStream("D:\\AES\\2.txt");
//		byte[] ib = new byte[in.available()];
//		in.read(ib);
//		byte[] deib = aesUtil3.decryptor(ib);

        System.out.println("明文是:" + msg);
        System.out.println("默认key:"+DEFAULT_KEY);
        String hex =AESUtil2.parseByte2HexStr(encontent);
        System.out.println("加密后原始二进制密文:" + new String(encontent));
        System.out.println("加密后:" + new String(hex));
        System.out.println("解密后:" + new String(decontent));
    }
}