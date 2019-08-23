package design.decorate.pancake;

public class MeatFloss extends Condiment {

    private  Pancake pancake;

    public MeatFloss(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public String getDesc() {
        return pancake.getDesc()+"肉松";
    }

    @Override
    public double price() {
        return pancake.price()+1;
    }
}
