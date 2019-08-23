package design.factory.factoryMethod;

public class TestMain {
    public static void main(String[] args) {
        IFactory factory=new UndergraduateFactory();
        LeiFeng leiFeng=factory.crateLeiFeng();
        System.out.println(leiFeng);
        leiFeng.buyRice();
        leiFeng.wash();
    }
}
