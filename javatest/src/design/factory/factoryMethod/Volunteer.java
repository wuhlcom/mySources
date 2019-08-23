package design.factory.factoryMethod;

public class Volunteer implements LeiFeng{
    @Override
    public void wash() {
        System.out.println("志愿者洗衣服");
    }

    @Override
    public void buyRice() {
        System.out.println("志愿者买米");
    }
}
