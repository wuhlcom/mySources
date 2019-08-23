package design.factory.abstractorFactory;

//简单工厂
//去掉各数据库软件的抽象工厂，让层次变的简单一些
//直接由简单工厂创建数据库表操作对象
public class DataAccessFactory {
    // private static  String dbType="mysql";
    private static String dbType = "mysql";

    public static IUser createUser() {
        IUser user = null;
        switch (dbType) {
            case "access":
                user = new AccessUser();
                break;
            case "mysql":
                user = new MysqlUser();
                break;
            default:
                user = new MysqlUser();
                break;
        }
        return user;
    }

    public static IDpt createDpt() {
        IDpt dpt = null;
        switch (dbType) {
            case "access":
                dpt = new AccessDpt();
                break;
            case "mysql":
                dpt = new MysqlDpt();
                break;
            default:
                dpt = new MysqlDpt();
                break;
        }

        return dpt;
    }

    public static String getDbType() {
        return dbType;
    }

    public static void setDbType(String dbType) {
        DataAccessFactory.dbType = dbType;
    }
}
