package design.state.switcher;

//开关,宿主类,有多个状态
//状态模式
public class Switcher {

    //不使用状态模式,Switcher就需对状态进行条件判断,当增加新的状态时,就会需要修改代码,不符合开闭原则
    //false代表关，true代表开
    // boolean state1 = false;//初始状态是关
    //
    // public void switchOn() {
    //     if (state1 == false) {//当前是关状态
    //         state1 = true;
    //         System.out.println("OK...灯亮");
    //     } else {//当前是开状态
    //         System.out.println("WARN!!!通电状态无需再开");
    //     }
    // }
    //
    // public void switchOff() {
    //     if (state1 == true) {//当前是开状态
    //         state1 = false;
    //         System.out.println("OK...灯灭");
    //     } else {//当前是关状态
    //         System.out.println("WARN!!!断电状态无需再关");
    //     }
    // }

    //初始状态
    private State state = new Off();

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void switcherOn() {
        state.switcherOn(this);
    }

    public void switcherOff() {
        state.switcherOff(this);

    }
}
