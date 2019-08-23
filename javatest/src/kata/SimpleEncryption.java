package kata;

import java.util.ArrayList;
import java.util.List;

public class SimpleEncryption {

    //原字符串中每个单词偶数位字符取出来，余下的字符拼接，取出来的字符拼接
    // "This is a test!", 1 -> "hsi  etTi sats!"
    // "This is a test!", 2 -> "hsi  etTi sats!" -> "s eT ashi tist!"
    // "This is a test!", 3 -> "hsi  etTi sats!" -> "s eT ashi tist!"->"Tah itse sits!"
    // "This is a test!", 4 -> "hsi  etTi sats!" -> "s eT ashi tist!"->"Tah itse sits!"->"This is a test!"
    public static String encrypt(final String text, final int n) {
        String[] strArr = text.split(" +");
        List<List<String>> all = new ArrayList<>();
        List<String> newStrList1 = new ArrayList<>();
        List<String> newStrList2 = new ArrayList<>();
        for (String str : strArr) {
            int len = str.length();
            if (len > 1) {
                StringBuilder sb = new StringBuilder(str);
                String odd = "";
                String even = "";
                char newChar = '\0';
                for (int i = 0; i < len; i++) {
                    if (i % 2 == 0) {
                        odd += str.charAt(i);
                    } else {
                        even += str.charAt(i);
                    }
                }
                newStrList1.add(odd);
                newStrList2.add(even);

            } else {
                newStrList1.add(str);
                newStrList2.add("");
            }
        }
        System.out.println(newStrList1);
        System.out.println(newStrList2);
        String thisStr="";
        String temp ="";
        List<String> newStrLs = new ArrayList<>();
        for (int i = 0; i < newStrList2.size(); i++) {
            StringBuilder sb = new StringBuilder();
            String str2 = newStrList2.get(i);
             if(str2.length()==1&&i==0){

            }else {
                int j = i + 1;
                if (j < newStrList1.size()) {
                    String str1 = newStrList1.get(j);
                    sb.append(str2 + str1);
                } else if (i == newStrList2.size() - 1) {
                    sb.append(newStrList2.get(newStrList2.size() - 1) + newStrList1.get(0));
                }

                if (str2.isEmpty()) {
                    temp = thisStr + sb.toString();
                    newStrLs.remove(thisStr);
                    continue;
                }
                thisStr = sb.toString();
                newStrLs.add(sb.toString());
            }
        }
        newStrLs.add(temp);
        System.out.println(newStrLs);
        return null;
    }

    public static String decrypt(final String encryptedText, final int n) {
        // Your code here
        return null;
    }

}
