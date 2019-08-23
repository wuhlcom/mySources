package design.factory.abstractorFactory;

//access操作Dpt表
public class AccessDpt implements IDpt{

    @Override
    public void insert() {
        System.out.println("access insert dpt");
    }

    @Override
    public Dpt selectOne() {
        Dpt dpt =new Dpt();
        dpt.setName("accessDpt");
        dpt.setDptId("accessDptId");
        System.out.println(dpt);
        return dpt;
    }
}
