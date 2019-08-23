package design.command.bake;

public class BakeChivesCmd  extends Command{
    public BakeChivesCmd(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    void executeCmd() {
        barbecuer.bakeChives();
    }
}
