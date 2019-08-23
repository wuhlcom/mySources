package design.state.work;

public class AfternoonState implements IState {
    @Override
    public void workProgram(Work work) {
        if (work.getHour() <=18.5) {
            System.out.println("下午"+work.getHour()+"点,工作效率还不错");
        } else {
            work.setState(new EveningState());
            work.workProgram();
        }
    }
}
