package design.factory.abstractorFactory;

//当使用不同的数据库管理软件时，对应的数据库操作会因为数据库管理软件不同而有差异，如access,mysql
//使用面向接口编程,不同的数据库软件工厂(accessFactory)实现同一个抽象数据库工厂(IFactory)
//数据库软件工厂(accessFactory)用于生产不同数据表操作对象(accessDpt,accessUser),而不同数据库的数据库表操作对象又实现了同一接口(IDpt,IUser)
//IFactory接口解决了不同数据库软件工厂的差异问题，IUser,IDpt接口解决不同数据库表操作的差异问题
public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        System.out.println("--------使用抽象工厂来切换数据库----------------");
        //当更换数据库时只要修改此处的数据库软件工厂即可切换数据库
        // IFactory factory=new MysqlFactory();
        IFactory factory = new AccessFactory();
        IUser user = factory.createUser();
        IDpt dpt = factory.createDpt();
        user.insert();
        user.selectOne();
        dpt.insert();
        dpt.selectOne();

        System.out.println("--------使用简单工厂来切换数据库----------------");
        //setDbType中可以使用变量，变量的值从配置文件中获取，这样可以达到不修改代码，只修改配置就可以切换不同类型数据库
        DataAccessFactory.setDbType("mysql");
        // DataAccess.setDbType("access");
        IUser iUser = DataAccessFactory.createUser();
        IDpt iDpt = DataAccessFactory.createDpt();
        iUser.insert();
        iUser.selectOne();
        iDpt.insert();
        iDpt.selectOne();

        System.out.println("--------使用反射来来切换数据库----------------");
        // ReflectDataAccess.setDbType("access");
        ReflectDataAccessFactory.setDbType("mysql");
        IUser rUser = ReflectDataAccessFactory.createUser();
        IDpt rDpt = ReflectDataAccessFactory.createDpt();
        rUser.insert();
        rUser.selectOne();
        rDpt.insert();
        rDpt.selectOne();
    }
}
