package design.state.switcher;

//状态类,改变宿主状态
public class On implements State {

    @Override
    public void switcherOn(Switcher switcher) {
        System.out.println("开关已是打开状态,不需再开");
    }

    @Override
    public void switcherOff(Switcher switcher) {
        switcher.setState(new Off());
        System.out.println("开关关闭");
    }
}
