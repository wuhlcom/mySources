package design.factory.factoryMethod;

public class VolunteerFactory implements IFactory {
    @Override
    public LeiFeng crateLeiFeng() {
        return new Volunteer();
    }
}
