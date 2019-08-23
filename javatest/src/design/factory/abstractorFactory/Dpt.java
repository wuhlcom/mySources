package design.factory.abstractorFactory;

//dpt表映射的对象
public class Dpt {
    private String dptId;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDptId() {

        return dptId;
    }

    public void setDptId(String dptId) {
        this.dptId = dptId;
    }

    @Override
    public String toString() {
        return "Dpt{" +
                "dptId='" + dptId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
