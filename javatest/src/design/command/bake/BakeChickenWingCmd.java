package design.command.bake;

//烤鸡翅
public class BakeChickenWingCmd extends Command {
    public BakeChickenWingCmd(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    void executeCmd() {
      barbecuer.bakeChickenWing();
    }
}
