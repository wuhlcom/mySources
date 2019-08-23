package design.factory.simpleFactory;

import java.util.Scanner;

//无封装，无继承，无多态
public class CaculatorVersion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("第一个数：");
        String strNumberA = sc.nextLine();
        System.out.println("请选运算符'+,-,*,/'");
        String strOpt = sc.nextLine();
        System.out.println("第二个数：");
        String strNumberB = sc.nextLine();
        String rs = "";
        switch (strOpt) {
            case "+":
                rs = Double.toString(Double.valueOf(strNumberA) + Double.valueOf(strNumberB));
                break;
            case "-":
                rs = Double.toString(Double.valueOf(strNumberA) - Double.valueOf(strNumberB));
                break;
            case "*":
                rs = Double.toString(Double.valueOf(strNumberA) * Double.valueOf(strNumberB));
                break;
            default:
                rs = Double.toString(Double.valueOf(strNumberA) / Double.valueOf(strNumberB));
                break;

        }

        System.out.println(rs);
    }
}
