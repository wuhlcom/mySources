package design.factory.abstractorFactory;

//access具体工厂
public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDpt createDpt() {
        return new AccessDpt();
    }
}
