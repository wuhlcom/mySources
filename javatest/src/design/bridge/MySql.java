package design.bridge;

public class MySql extends DataBase {
    public MySql(Conver conver) {
        super(conver);
    }

    @Override
    public void conversion() {
        conver.doConver();
    }
}
