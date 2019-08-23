package design.factory.abstractorFactory;

//mysql操作dpt表
public class MysqlDpt implements IDpt {
    @Override
    public void insert() {
        System.out.println("mysql insert dpt");
    }

    @Override
    public Dpt selectOne() {
        Dpt dpt =new Dpt();
        dpt.setName("mysqlDpt");
        dpt.setDptId("mysqlDptId");
        System.out.println(dpt);
        return dpt;
    }
}
