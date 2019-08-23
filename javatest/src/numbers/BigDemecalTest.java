package numbers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BigDemecalTest {

    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(1.);
        BigDecimal bigDecimal1 = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(bigDecimal1);
        System.out.println(numToVoice(bigDecimal1));
        // System.out.println(removeTailZero("00"));
        // removeTailZero("20222100");
    }

    public static String numToVoice(BigDecimal number) {
        StringBuffer sb = new StringBuffer();
        String numStr = String.valueOf(number);
        if (numStr.contains(".")) {
            String[] strArr = numStr.split("\\.");
            if (strArr.length == 2) {
                String intStr = numToVoiceCn(strArr[0]); //整数部分
                sb.append(intStr);
                String demicalNum = strArr[1].replaceAll("(?<=\\d|0)0+$|^0+$","");
                // String demicalNum = removeTailZero(strArr[1]);
                if (demicalNum != null && !demicalNum.isEmpty()) {
                    String demStr = numToVoiceNum(demicalNum);  //小数部分
                    sb.append(",");
                    sb.append("点,");
                    sb.append(demStr);
                }
            } else {
                String intStr = numToVoiceCn(strArr[0]);
                sb.append(intStr);
            }
        }
        return sb.toString();
    }

    public static String removeTailZero(String str) {
        StringBuffer sb = new StringBuffer();
        int nonZeroIndex = str.length();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != '0') {
                nonZeroIndex = i;
                break;
            }
        }
        if (nonZeroIndex != str.length()) {
            for (int i = 0; i <= nonZeroIndex; i++) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String numToVoiceNum(String numStr) {
        String str = "";
        if (numStr != null && !numStr.isEmpty()) {
            String[] strs = numStr.split("");
            str = Arrays.stream(strs).map(s -> s.toString()).collect(Collectors.joining(","));
        }
        return str;
    }

    public static String numToVoiceCn(String numStr) {
        StringBuffer sb = new StringBuffer();
        String b, c, d;
        if (numStr.length() == 2) {
            sb.append(numStr.substring(0, 1));
            sb.append(",");
            sb.append("十");
            sb.append(",");
            sb.append(numStr.substring(1).equals("0") ? "" : numStr.substring(1));
        } else if (numStr.length() == 3) {
            sb.append(numStr.substring(0, 1));
            sb.append(",");
            sb.append("百");
            sb.append(",");
            c = numStr.substring(1, 2);
            d = numStr.substring(2);
            sb.append(d.equals("0") ? (c.equals("0") ? "" : (c + ",十")) : (c.equals("0") ? "0" : (c + ",十")));
            sb.append(",");
            sb.append(d.equals("0") ? "" : d);
        } else if (numStr.length() == 4) {
            sb.append(numStr.substring(0, 1));
            sb.append(",");
            sb.append("千");
            sb.append(",");
            b = numStr.substring(1, 2);
            c = numStr.substring(2, 3);
            d = numStr.substring(3);
            sb.append((c.equals("0") && d.equals("0")) ? (b.equals("0") ? "" : (b + ",百")) : (b.equals("0") ? "0" : (b + ",百")));
            sb.append(",");
            sb.append((d.equals("0") || b.equals("0")) ? (c.equals("0") ? "" : (c + ",十")) : (c.equals("0") ? "0" : (c + ",十")));
            sb.append(",");
            sb.append(d.equals("0") ? "" : d);
        } else {
            return numStr;
        }
        return sb.toString();
    }
}
