package proxy.aop;

public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("add aop");

    }

    @Override
    public void delUser() {
        System.out.println("del aop");

    }

    @Override
    public void updateUser() {
        System.out.println("update aop");

    }
}
