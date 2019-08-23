package design.state.work;

//一天的工作状态变化，分为上午，中午，下午，黄昏，下班，休息时
//宿主中有一个方法来调用状态实例的改变状态的方法
public class Work {
    private double hour;
    private boolean finished=false;
    private IState state;

    //初始的工作状态
    public Work() {
        this.state = new ForeNoonState();
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public void workProgram(){
        state.workProgram(this);
    }
}
