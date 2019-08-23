package design.state.switcher;

public class Off implements State {

    @Override
    public void switcherOn(Switcher switcher) {
        switcher.setState(new On());
        System.out.println("打开开关");
    }

    @Override
    public void switcherOff(Switcher switcher) {
        System.out.println("开关已经是关闭状态,不需要再关");
    }
}
