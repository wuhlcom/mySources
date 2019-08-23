package design.bridge;

//将不同的数据库查出来出数据转成多种格式
//如，将mysql,oracle, sql server查出来的数据转成xml,pdf,doc格式
//数据格式转换的实现接口
public interface Conver {
    public void doConver();
}
