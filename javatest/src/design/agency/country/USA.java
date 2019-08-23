package design.agency.country;

public class USA extends Country {

    public USA(UnitedNations unitedNations) {
        super(unitedNations);
    }

    public void declare(String msg){
        System.out.println(this.getClass().getSimpleName()+"发表声明:"+msg);
        unitedNations.declare(msg,this);
    }

    public void getMsg(String msg){
        System.out.println(this.getClass().getSimpleName()+"收到声明:"+msg);
    }
}
