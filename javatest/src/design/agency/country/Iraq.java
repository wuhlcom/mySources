package design.agency.country;

public class Iraq extends Country {

    public Iraq(UnitedNations unitedNations) {
        super(unitedNations);
    }

    @Override
    public void declare(String msg) {
        System.out.println(this.getClass().getSimpleName()+"发表声明:"+msg);
        unitedNations.declare(msg,this);
    }

    @Override
    public void getMsg(String msg) {
        System.out.println(this.getClass().getSimpleName()+"收到声明:"+msg);
    }


}
