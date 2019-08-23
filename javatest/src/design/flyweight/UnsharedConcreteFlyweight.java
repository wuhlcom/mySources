package design.flyweight;

public class UnsharedConcreteFlyweight extends IFlyweight {
    @Override
    public void operate(int extrinsicstate) {
        System.out.println("不共享的flyweight"+extrinsicstate);
    }
}
