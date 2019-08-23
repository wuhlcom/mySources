package design.singleton.CSDN;

public class TestMain {
    public static void main(String[] args) {
        Singleton5 singleton51=Singleton5.getInstance();
        Singleton5 singleton52=Singleton5.getInstance();
        System.out.println(singleton51);
        System.out.println(singleton52);
        System.out.println(singleton51.equals(singleton52));
    }
}
