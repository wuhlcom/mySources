/** 
* @author :wuhongliang wuhongliang@zhilutec.com
* @version :2017骞�8鏈�2鏃� 涓嬪崍4:06:17 * 
*/ 
package aes.aes128;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;


/**
 * 绠楁硶宸ュ叿
 * @author Babylon 214750838@qq.com
 * @date 2014-8-15 涓婂崍8:41:49
 */
public class AlgorithmUtil {

    public final static String ENCODING = "UTF-8";

    /**灏嗕簩杩涘埗杞崲鎴�16杩涘埗 
     * @param buf 
      * @return 
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

     /**灏�16杩涘埗杞崲涓轰簩杩涘埗 
      * @param hexStr 
       * @return 
       */   
      public static byte[] parseHexStr2Byte(String hexStr) {   
              if (hexStr.length() < 1)   
                      return null;   
              byte[] result = new byte[hexStr.length()/2];   
              for (int i = 0;i< hexStr.length()/2; i++) {   
                      int high = Integer.parseInt(hexStr.substring(i*2, i*2+1), 16);   
                      int low = Integer.parseInt(hexStr.substring(i*2+1, i*2+2), 16);   
                      result[i] = (byte) (high * 16 + low);   
              }   
              return result;   
      }   

     /** 
     * 鐢熸垚瀵嗛挜 
     * 鑷姩鐢熸垚base64 缂栫爜鍚庣殑AES128浣嶅瘑閽� 
     * @throws NoSuchAlgorithmException 
     * @throws UnsupportedEncodingException 
     */  
    public static String getAESKey() throws Exception {  
        KeyGenerator kg = KeyGenerator.getInstance("AES");  
        kg.init(128);//瑕佺敓鎴愬灏戜綅锛屽彧闇�瑕佷慨鏀硅繖閲屽嵆鍙�128, 192鎴�256  
        SecretKey sk = kg.generateKey();  
        byte[] b = sk.getEncoded();
        return parseByte2HexStr(b);
    }  

    /**
     * AES 鍔犲瘑 
     * @param base64Key   base64缂栫爜鍚庣殑 AES key
     * @param text  寰呭姞瀵嗙殑瀛楃涓�
     * @return 鍔犲瘑鍚庣殑byte[] 鏁扮粍
     * @throws Exception
     */
    public static byte[] getAESEncode(String base64Key, String text) throws Exception{  
        byte[] key = parseHexStr2Byte(base64Key);
        SecretKeySpec sKeySpec = new SecretKeySpec(key, "AES");  
        Cipher cipher = Cipher.getInstance("AES");  
        cipher.init(Cipher.ENCRYPT_MODE, sKeySpec);  
        byte[] bjiamihou = cipher.doFinal(text.getBytes(ENCODING));  
        return bjiamihou;  
    }  

    /**
     * AES瑙ｅ瘑
     * @param base64Key   base64缂栫爜鍚庣殑 AES key
     * @param text  寰呰В瀵嗙殑瀛楃涓�
     * @return 瑙ｅ瘑鍚庣殑byte[] 鏁扮粍
     * @throws Exception
     */
    public static byte[] getAESDecode(String base64Key, byte[] text) throws Exception{  
        byte[] key = parseHexStr2Byte(base64Key);
        SecretKeySpec sKeySpec = new SecretKeySpec(key, "AES");  
        Cipher cipher = Cipher.getInstance("AES");  
        cipher.init(Cipher.DECRYPT_MODE, sKeySpec);  
        byte[] bjiemihou = cipher.doFinal(text);  
        return bjiemihou;
    }  

}