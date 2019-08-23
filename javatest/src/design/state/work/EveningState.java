package design.state.work;

public class EveningState implements IState {
    @Override
    public void workProgram(Work work) {
        if (work.getHour() <=21.5) {
            if (work.isFinished()) {
                work.setState(new RestState());
                work.workProgram();
            } else {
                if (work.getHour() <= 21.5) {
                    System.out.println("当前时间为:" + work.getHour() + ",正在加班，好累哦。。。");
                } else {
                    work.setState(new SleepingState());
                    work.workProgram();
                }
            }
        }else {
            work.setState(new SleepingState());
            work.workProgram();
        }
    }
}

