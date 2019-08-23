package design.decorate.person;

public class TShirts extends Finery {
    public TShirts(Person componet) {
        super(componet);
    }

    @Override
    public void show(){
        System.out.println("大T");
        componet.show();
    }
}
