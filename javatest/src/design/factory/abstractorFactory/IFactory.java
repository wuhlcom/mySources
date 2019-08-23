package design.factory.abstractorFactory;

//抽象工厂
public interface IFactory {
    public IUser createUser();
    public IDpt createDpt();
}
