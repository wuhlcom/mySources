package design.state.switcher;

public class Test {
    public static void main(String[] args) {
        //对于用户来说只需知道开关怎么按，按下后怎么实现的被隐藏
        Switcher switcher=new Switcher();
        switcher.switcherOn();
        switcher.switcherOff();
        switcher.switcherOff();
        switcher.switcherOn();
    }
}
