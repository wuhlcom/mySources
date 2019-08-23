package design.factory.factoryMethod;

public class Undergraduate implements LeiFeng {
    @Override
    public void wash() {
        System.out.println("学生洗衣服");
    }

    @Override
    public void buyRice() {
        System.out.println("学生买米");
    }
}
