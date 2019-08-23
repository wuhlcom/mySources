package design.factory.simpleFactory;
import java.util.Scanner;


//封装，继承，多态，工厂
//工厂根据传入的字符串，生产不同的子类，
// 父类引用来指向生产出来的类，
// 这样对用户来说并不知道有add,sub,mul,div这些子类，
// 工厂相当对子类做了一层封装用户只需知道operation类和operationFactory类
//add,sub,mul,div这些子类就是不同的算法，这里其实就是相当于策略模式了
public class CaculatorVersion3 {

    abstract class Operation {
        private double number1 = 0;
        private double number2 = 0;

        public double getNumber1() {
            return number1;
        }

        public void setNumber1(double number1) {
            this.number1 = number1;
        }

        public double getNumber2() {
            return number2;
        }

        public void setNumber2(double number2) {
            this.number2 = number2;
        }

        abstract double getRs() throws Exception;
    }

    class Add extends Operation {
        @Override
        public double getRs() {
            return getNumber1() + getNumber2();
        }
    }

    class Sub extends Operation {
        @Override
        public double getRs() {
            return getNumber1() - getNumber2();
        }
    }


    class Mul extends Operation {
        @Override
        public double getRs() {
            return getNumber1() * getNumber2();
        }
    }


    class Div extends Operation {
        @Override
        public double getRs() throws Exception {
            if (getNumber2() == 0) {
                System.out.println(getNumber2());
                throw new Exception("除数不能为0");
            }
            return getNumber1() / getNumber2();
        }
    }

    class OperationFactory {

        public Operation createOperation(String opt) {
            Operation op = null;
            switch (opt) {
                case "+":
                    op = new CaculatorVersion3().new Add();
                    break;
                case "-":
                    op = new CaculatorVersion3().new Sub();
                    break;
                case "*":
                    op = new CaculatorVersion3().new Mul();
                    break;
                case "/":
                    op = new CaculatorVersion3().new Div();
                    break;
            }
            return op;

        }

    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("第一个数：");
        String strNumberA = sc.nextLine();
        System.out.println("请选运算符'+,-,*,/'");
        String strOpt = sc.nextLine();
        System.out.println("第二个数：");
        String strNumberB = sc.nextLine();

        Operation operation = new CaculatorVersion3().new OperationFactory().createOperation(strOpt);
        // operation.setNumber1(Double.valueOf(strNumberA));
        operation.number1=Double.valueOf(strNumberA);
        operation.setNumber2(Double.valueOf(strNumberB));
        double rs =operation.getRs();
        System.out.println(rs);
    }

}
