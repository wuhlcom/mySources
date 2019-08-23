package design.state.work;

public class NoonState implements IState {

    @Override
    public void workProgram(Work work) {
           if(work.getHour()<=13.5){
               System.out.println("中午"+work.getHour()+"点了,该吃饭和休息了");
           }else {
               work.setState(new AfternoonState());
               work.workProgram();
           }
    }
}
