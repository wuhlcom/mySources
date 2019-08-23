package design.state.work;

public class Test {

    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(11);
        // //调用workProgram改变工作状态
        work.workProgram();
        work.setHour(12.1);
        //调用workProgram改变工作状态
        work.workProgram();

        work.setHour(14);
        //调用workProgram改变工作状态
        work.workProgram();

        work.setHour(19);
        work.setFinished(true);
        //调用workProgram改变工作状态
        work.workProgram();

        work.setHour(21);
        //调用workProgram改变工作状态
        work.workProgram();

        work.setHour(21.6);
        //调用workProgram改变工作状态
        work.workProgram();

        work.setHour(22.6);
        //调用workProgram改变工作状态
        work.workProgram();
    }
}
