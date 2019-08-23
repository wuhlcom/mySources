package design.command.telecontroller;

public class Switcher {
    // 此开关与灯耦合，无法替换为其他电器。
    // private Bulb bulb = new Bulb();

    // 此开关与电器接口耦合，可任意替换电器。
    // private Switchable switchable; 虽然可以替换设备，但只能是Switchable设备对象，
    // 这就与”可开关设备接口“强耦合了，也就是说它只能控制“灯泡或风扇”，并不能控制”电视或收音机”。
    private Switchable switchable;

    public void setSwitchable(Switchable switchable) {
        this.switchable = switchable;
    }

    public void buttonOn(){
        System.out.println("按下开……");
        switchable.on();
    }

    public void buttonOff(){
        System.out.println("按下关……");
        switchable.off();
    }
}
