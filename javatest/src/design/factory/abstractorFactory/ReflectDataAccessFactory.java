package design.factory.abstractorFactory;

//简单工厂
//去掉各数据库软件的抽象工厂，让层次变的简单一些
//直接由简单工厂接合反射来去掉switch case,根据配置文件中设置的数据库类型来实现数据
public class ReflectDataAccessFactory {
    private static String dbType = "Mysql";

    public static IUser createUser() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        IUser user = null;
        String dbClass = "design.factory.abstractorFactory." + dbType + "BeijinUser";
        System.out.println(dbClass);
        Class userClazz = Class.forName(dbClass);
        user = (IUser) userClazz.newInstance();
        return user;
    }

    public static IDpt createDpt() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        IDpt dpt = null;
        String dbClass = "design.factory.abstractorFactory." + dbType + "Dpt";
        System.out.println(dbClass);
        Class userClazz = Class.forName(dbClass);
        dpt = (IDpt) userClazz.newInstance();
        return dpt;
    }

    public static String getDbType() {
        return dbType;
    }

    public static void setDbType(String dbType) {
        //首字母转为大写，用于拼接的类名
        String loDbType = dbType.toLowerCase();
        String upFirstDbType = loDbType.substring(0, 1).toUpperCase() + loDbType.substring(1);
        ReflectDataAccessFactory.dbType = upFirstDbType;
    }
}
