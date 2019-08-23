package design.command.bake;

public class BakeMuttonCmd extends Command {

    public BakeMuttonCmd(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    void executeCmd() {
        barbecuer.bakeMutton();
    }
}
