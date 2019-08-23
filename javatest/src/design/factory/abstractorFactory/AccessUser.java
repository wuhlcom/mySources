package design.factory.abstractorFactory;

//access操作user表
public class AccessUser  implements IUser{

    @Override
    public void insert() {
        System.out.println("access insert user");
    }

    @Override
    public User selectOne() {
        User user =new User();
        user.setName("access");
        user.setUserId("accessId");
        System.out.println(user);
        return user;
    }
}
