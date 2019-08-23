package design.decorate.pancake;

import design.decorate.pancake.Pancake;

public class Roujaimoe extends Pancake {

    public Roujaimoe() {
        desc="肉夹馍";
    }

    @Override
    public double price() {
        return 6;
    }
}
