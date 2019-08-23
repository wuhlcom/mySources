package design.command.bake;

public class Client {

    public static void main(String[] args) {
        Barbecuer chef=new Barbecuer();

        Command cmd1=new BakeMuttonCmd(chef);
        Command cmd2=new BakeChickenWingCmd(chef);
        Command cmd3=new BakeChivesCmd(chef);
        Command cmd4=new BakeCowhellsCmd(chef);

        Waiter waiter =new Waiter();
        waiter.setCommand(cmd4);
        waiter.setCommand(cmd1);
        waiter.setCommand(cmd2);
        waiter.setCommand(cmd3);
        waiter.cancelOrder(cmd4);

        waiter.notifyToChef();
    }
}
