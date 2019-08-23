package classtest;

public class Demo {
    public static String mem1="mem1";
    public String mem2="mem2";

    public static void method1(){
        System.out.println("I am a static method1");
    }

    public void method2(){
        System.out.println("I am a non-static method");
    }

    @Override
    public String toString() {
        return "Demo{" +
                "mem2='" + mem2 + '\'' +        "mem1='" + mem1 + '\'' +
                '}';
    }
}
