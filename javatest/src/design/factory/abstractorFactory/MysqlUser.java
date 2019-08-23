package design.factory.abstractorFactory;


//mysql操作user表
public class MysqlUser implements IUser {
    @Override
    public void insert() {
        System.out.println("mysql insert user");
    }

    @Override
    public User selectOne() {
        User user =new User();
        user.setName("mysql");
        user.setUserId("mysqlId");
        System.out.println(user);
        return user;
    }
}
