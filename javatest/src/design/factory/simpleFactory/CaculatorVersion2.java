package design.factory.simpleFactory;

import java.util.Scanner;

//封装
public class CaculatorVersion2 {

    class Operation {
        public String getRs(String strNumberA, String strNumberB, String strOpt) {
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
                case "/":
                    if (Double.valueOf(strNumberB) == 0) {
                        System.out.println("除数不能为0");
                        return "0";
                    }
                    rs = Double.toString(Double.valueOf(strNumberA) / Double.valueOf(strNumberB));
                    break;
                default:
                    System.out.println("非法运算符");
                    return "0";

            }
            System.out.println(rs);
            return rs;
        }
    }

    public static void main(String[] args) {
        Operation operation = new CaculatorVersion2().new Operation();
        Scanner sc = new Scanner(System.in);
        System.out.println("第一个数：");
        String strNumberA = sc.nextLine();
        System.out.println("请选运算符'+,-,*,/'");
        String strOpt = sc.nextLine();
        System.out.println("第二个数：");
        String strNumberB = sc.nextLine();
        operation.getRs(strNumberA, strNumberB, strOpt);
    }

}
