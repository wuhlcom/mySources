package design.flyweight;

public class Test {


    public static void main(String[] args) {
        int extrisicestate = 33;
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        IFlyweight flx = flyweightFactory.getInstance("x");
        flx.operate(--extrisicestate);
        IFlyweight fly = flyweightFactory.getInstance("y");
        fly.operate(--extrisicestate);
        IFlyweight flz = flyweightFactory.getInstance("z");
        flz.operate(--extrisicestate);

        UnsharedConcreteFlyweight unsharedConcreteFlyweight=new UnsharedConcreteFlyweight();
        unsharedConcreteFlyweight.operate(--extrisicestate);
    }

}
