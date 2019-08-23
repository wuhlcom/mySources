package design.command.bake;

abstract public class Command {
    protected  Barbecuer barbecuer;

    public Command(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    abstract void executeCmd();
}
