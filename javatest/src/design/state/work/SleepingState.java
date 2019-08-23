package design.state.work;

public class SleepingState implements IState {
    @Override
    public void workProgram(Work work) {
           System.out.println("当前"+work.getHour()+"点了，睡着了!");
    }
}
