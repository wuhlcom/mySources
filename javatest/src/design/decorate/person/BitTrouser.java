package design.decorate.person;

public class BitTrouser extends Finery {
    public BitTrouser(Person componet) {
        super(componet);
    }

    @Override
    public void show(){
        System.out.println("跨裤");
        componet.show();
    }
}
