package design.factory.factoryMethod;

public class UndergraduateFactory implements IFactory{
    @Override
    public LeiFeng crateLeiFeng() {
        return new Undergraduate();
    }
}
