package kata;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

//Valid Braces
//[{}] true   [} false [{}}(] false
//1 括号必须成对存在,总字符数必须是偶数个字符
//2 括号必须如果有其它括号，其它括号必须成对也必须成对存在
//3 括号要么紧密相邻，否则就会在字符串中位置索引是对称的
//4 左括号的index小于右括号
public class BraceChecker {

    public boolean isValid(String braces) {
        String a1 = "{";
        String a2 = "}";
        String b1 = "(";
        String b2 = ")";
        String c1 = "[";
        String c2 = "]";
        braces = braces.trim();
        String[] braceArr = braces.split("");
        List<String> list = Arrays.asList(braceArr);
        if (braces.length() % 2 != 0) {
            return false;
        } else {
            boolean flag = false;
            if (list.get(0).equals(a2)||list.get(0).equals(b2)||list.get(0).equals(c2)||list.get(list.size()-1).equals(a1)||list.get(list.size()-1).equals(b1)||list.get(list.size()-1).equals(c1)){
                return false;
            }
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(a1)) {
                    if (list.get(i + 1).equals(a2)) {
                        flag = true;
                        i += 1;
                    } else if (list.get(list.size() - 1 - i).equals(a2)) {
                        flag = true;
                    }
                } else if (list.get(i).equals(b1)) {
                    if (list.get(i + 1).equals(b2)) {
                        flag = true;
                        i += 1;
                    } else if (list.get(list.size() - 1 - i).equals(b2)) {
                        flag = true;
                    }
                } else if (list.get(i).equals(c1)) {
                    if (list.get(i + 1).equals(c2)) {
                        flag = true;
                        i += 1;
                    } else if (list.get(list.size() - 1 - i).equals(c2)) {
                        flag = true;
                    }
                }
                if (flag == false) {
                    return flag;
                }
            }
            return flag;
        }
    }

    //堆栈对象,LIFO后进先出
    public boolean isValid1(String braces) {
        Stack<Character> s = new Stack<>();
        for (char c : braces.toCharArray())
            if (s.size() > 0 && isClosing(s.peek(), c)) s.pop();
            else s.push(c);
        return s.size() == 0;
    }


    public boolean isClosing(char x, char c) {
        return (x == '{' && c == '}') || (x == '(' && c == ')') || (x == '[' && c == ']');
    }


    //如果是按序对称的，从内到外逐步去掉符号对，最后字符串长度为0则表示是正常的
    public boolean isValid2(String braces) {
        String b = braces;
        System.out.println(braces);
        for(int i=0;i<braces.length()/2;i++)
        {
            b = b.replaceAll("\\(\\)", "");
            b = b.replaceAll("\\[\\]", "");
            b = b.replaceAll("\\{\\}", "");

            if(b.length() == 0)
                return true;
        }
        return false;
    }



    public static void main(String[] args) {
        BraceChecker braceChecker = new BraceChecker();
        // String str1 = "{}";
        // System.out.println(braceChecker.isValid2(str1));

        String str2 = "[({})]";
        System.out.println(braceChecker.isValid2(str2));

        // String str3 = "{[})(]";
        // System.out.println(braceChecker.isValid2(str3));
        //
        // String str4 = "{[}";
        // System.out.println(braceChecker.isValid2(str4));
        //
        // String str5 = "()";
        // System.out.println(braceChecker.isValid2(str5));
        //
        // String str6 = "{}[]()";
        // System.out.println(braceChecker.isValid2(str6));
        //
        // String str7 = "{}[])(";
        // System.out.println(braceChecker.isValid2(str7));


    }
}