package proxy.aop;

public class TestMain {

    public static void main(String[] args) {
        // UserService userService = MyBeanFactory.createUserService();
        // userService.addUser();
        // userService.updateUser();
        // userService.delUser();

        UserServiceImpl userServiceImpl = CglibBeanFactory.createUserService();
        userServiceImpl.addUser();
        userServiceImpl.updateUser();
        userServiceImpl.delUser();

    }
}
