package design.decorate.person;

public class Finery extends Person {
    protected  Person componet;

    public Finery(Person componet) {
        this.componet = componet;
    }

    @Override
    public void show() {
        if (componet!=null){
            componet.show();
        }
    }
}
