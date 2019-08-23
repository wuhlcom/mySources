package proxy.subjeckt;

public class RealSubject implements Subject {

    @Override
    public void rent() {
        System.out.println("rent my building");
    }

    @Override
    public void hello(String str) {
        System.out.println("hello");
    }
}
