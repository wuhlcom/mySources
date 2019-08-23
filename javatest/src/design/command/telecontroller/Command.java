package design.command.telecontroller;

public interface Command {
    //执行操作
    public void exe();
    //撤消操作
    public void unexe();
}
