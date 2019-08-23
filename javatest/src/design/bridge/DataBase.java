package design.bridge;

//数据库的抽象
abstract public class DataBase{

    protected Conver conver;

    public void setConver(Conver conver) {
        this.conver = conver;
    }

    public DataBase(Conver conver) {
        this.conver = conver;
    }

    abstract public void conversion();
}
