package design.agency.country;

public class Test {
    public static void main(String[] args) {
        SecurityUnitedNations unitedNations = new SecurityUnitedNations();
        USA usa =new USA(unitedNations);
        Iraq iraq=new Iraq(unitedNations);
        unitedNations.setUsa(usa);
        unitedNations.setIraq(iraq);

        String usaMsg="小伊拉，哥弄死你!";
        String irqMsg="孙子老美，小爷不怕，你能咋滴!";
        usa.declare(usaMsg);
        iraq.declare(irqMsg);
    }
}
