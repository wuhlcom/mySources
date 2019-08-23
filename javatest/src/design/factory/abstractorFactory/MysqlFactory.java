package design.factory.abstractorFactory;
//mysql具体工厂
public class MysqlFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new MysqlUser();
    }

    @Override
    public IDpt createDpt() {
        return new MysqlDpt();
    }
}
