package design.flyweight;

public class ConcreteFlyweight extends IFlyweight {
    @Override
    public void operate(int extrinsicstate) {
        System.out.println("具体的flyweight"+extrinsicstate);
    }
}
