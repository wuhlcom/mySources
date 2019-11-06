package binary;

public class MainClass {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a=" + a + ",b=" + b);
        int d1=16;
        int d2=13;
        System.out.println(d1&d1-1);
        System.out.println("==================");
        System.out.println(d2&d2-1);


    }

}
