package design.bridge;

public class Oracle extends DataBase {
    public Oracle(Conver conver) {
        super(conver);
    }

    @Override
    public void conversion() {
        conver.doConver();
    }
}
