package design.chain;

abstract public class Manager {

    protected String name; //审批人姓名
    protected Manager nextManager; //下一级审批人

    public void setManager(Manager nextManager) {
        this.nextManager = nextManager;
    }

    public Manager setMana(Manager nextManager) {
        this.nextManager = nextManager;
        return this.nextManager;
    }

    public Manager(String name) {
        this.name = name;
    }

    abstract public void manage(int salary);
}
