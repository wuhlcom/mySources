package design.command.telecontroller;


public class Client {
    public static void main(String[] args) {
        System.out.println("===客户端用【电线】直接操作灯泡===");
        Bulb bulb = new Bulb();
        bulb.on();
        bulb.off();

        Fan fan = new Fan();
        fan.on();
        fan.off();

        // 所以，如何把控制器与设备完全给拆解开势在必行，此时命令模式粉墨登场。
        // 现在我们得新定义出一组”命令“模块把控制器（发令者）与设备（执行者）彻底解耦，就以电视机和遥控器举例说明吧。
        System.out.println("====客户端使用开关 策略模式====");
        Switcher switcher = new Switcher();
        switcher.setSwitchable(bulb);
        switcher.buttonOn();
        switcher.buttonOff();

        switcher.setSwitchable(fan);
        switcher.buttonOn();
        switcher.buttonOff();

        System.out.println("=========命令模式,将遥控器与设备解绑===========");
        Device tv = new TV();
        Device radio = new Radio();

        Controller controller = new Controller();
        controller.bindOKCommand(new SwitchCmd(tv));
        controller.bindVerticalCommand(new VolumeCmd(tv));
        controller.bindHorizontalCommand(new ChanelCmd(tv));

        controller.buttonOKHold();
        controller.buttonOKClick();

        controller.buttonLeftClick();
        controller.buttonRightClick();

        controller.buttonUpClick();
        controller.buttonDownClick();

        System.out.println("=========命令模式,将遥控器与设备解绑===========");

        controller.bindOKCommand(new SwitchCmd(radio));
        controller.bindVerticalCommand(new VolumeCmd(radio));
        controller.bindHorizontalCommand(new ChanelCmd(radio));
        controller.buttonOKHold();
        controller.buttonOKClick();
        controller.buttonLeftClick();
        controller.buttonRightClick();
        controller.buttonUpClick();
        controller.buttonDownClick();


    }


}
