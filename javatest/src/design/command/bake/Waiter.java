package design.command.bake;

import java.util.ArrayList;
import java.util.List;

//服务员
public class Waiter {

    //多个烧烤请求一次告诉厨师
    private List<Command> orders = new ArrayList<>();

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
        //鸡翅没有要通知客户
        if (command.getClass() == BakeChickenWingCmd.class) {
            System.out.println("===========鸡翅卖完了===============");
        } else {
            System.out.println(">>>记录订单"+command.getClass().getSimpleName());
            orders.add(command);
        }
    }

    public void notifyToChef() {
        System.out.println(">>>通知厨师");
        for (Command order : orders) {
            order.executeCmd();
        }
    }

    //客户取消烤牛筋
    public void cancelOrder(Command command) {
        System.out.println(">>>取消订单"+command.getClass().getSimpleName());
        orders.remove(command);
    }


}
