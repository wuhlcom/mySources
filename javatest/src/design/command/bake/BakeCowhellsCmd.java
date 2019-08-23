package design.command.bake;

//牛筋
public class BakeCowhellsCmd extends Command{
    public BakeCowhellsCmd(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    void executeCmd() {
        barbecuer.bakeCowhells();
    }
}
