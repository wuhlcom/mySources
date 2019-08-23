package proxy.cglib;

public class TestMain {

    public static void main(String[] args) {
        UserServiceImpl userServiceImpl = MyBeanFactory.createUserService();
        userServiceImpl.addUser();
        userServiceImpl.updateUser();
        userServiceImpl.delUser();
    }
}
