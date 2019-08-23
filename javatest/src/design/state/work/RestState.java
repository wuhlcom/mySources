package design.state.work;

public class RestState implements IState {
    @Override
    public void workProgram(Work work) {
        if (work.getHour()<22.5) {
            System.out.println("下班了放松一下!");
        }else {
            work.setState(new SleepingState());
            work.workProgram();
        }
    }
}
