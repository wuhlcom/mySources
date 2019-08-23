package design.decorate.pancake;

public class Cucumber extends Condiment {

    private  Pancake pancake;

    public Cucumber(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public String getDesc() {
        return pancake.getDesc()+"黄瓜片";
    }

    @Override
    public double price() {
        return pancake.price()+0.5;
    }
}
