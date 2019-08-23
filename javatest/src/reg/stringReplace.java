package reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//在所有单个数字前插入0
public class stringReplace {

    public static void main(String[] args) {
        String str = "6可0能22中4多少0元99分3.33钟1.00元11.44我停车0分88.8钟103天";
        // String str = "6可0能22中3多少0元11分钟我停车0分钟103天";
        // String str = "6可0能22在121分";
        // String str = "停车0分钟";
        // System.out.println(str);
        // String rs = mendStrSpace(str);
        // System.out.println(rs);

        String s2 = "d3.2K5.5E6.33中";
        String addZ = addZero(s2);
        System.out.println(addZ);
    }


    public static String mendStrSpace(String str) {
        StringBuilder sb = new StringBuilder(str);
        Pattern p = Pattern.compile("(\\d+\\.\\d+)|\\d+");
        Matcher m = p.matcher(str);
        int i = 0;
        while (m.find()) {
            m.start();
            String matchNumber = m.group();
            if (!matchNumber.contains(".") && odd(matchNumber.length())) {
                sb.insert(m.start() + matchNumber.length() + i, " ");
                i++;
            }
        }
        return sb.toString();
    }

    public static Boolean odd(int a) {
        if ((a & 1) == 1) {
            return true;
        } else {
            return false;
        }
    }


    public static String addStrZero(String str) {
        StringBuilder sb = new StringBuilder(str);
        Pattern p = Pattern.compile("(?<=\\D)\\d{1}(?=\\D)|(?<=^)\\d|(?<=\\D)\\d(?=$)");
        Matcher m = p.matcher(str);
        int i = 0;
        while (m.find()) {
            sb.insert(m.start() + i, 0);
            i++;
        }
        return sb.toString();
    }


    public static String addStrDot(String str) {
        StringBuilder sb = new StringBuilder(str);
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(str);
        String mStr = "";
        String fStr = "";
        while (m.find()) {
            mStr = m.group();
        }
        if (!mStr.isEmpty()) {
            fStr = str.replaceAll(mStr, mStr + " ");
        }
        return fStr.isEmpty() ? str : fStr;
    }

    public static String addZero(String str) {
        StringBuilder sb = new StringBuilder(str);
        Pattern p = Pattern.compile("(\\d+\\.\\d+)");
        Matcher m = p.matcher(str);
        String mStr = "";
        String newStr = "";
        while (m.find()) {
            mStr = m.group();
            if (mStr.toString().length() == 3) {
                String mStrArr[] = mStr.toString().split("\\.");
                if (mStrArr[1].length() == 1) {
                    newStr = str.replaceAll(mStr, mStr + 0);
                }
            }
        }
        return newStr.isEmpty() ? str : newStr;
    }

}
