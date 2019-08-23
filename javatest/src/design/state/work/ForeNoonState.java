package design.state.work;

public class ForeNoonState implements IState {

    @Override
    public void workProgram(Work work) {
        if(work.getHour()<=12){
            System.out.println("上午12点前,精力满满,工作效率高!");
        }else{
            work.setState(new NoonState());
            work.workProgram();
        }
    }

}
