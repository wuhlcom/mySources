package design.builder.building;

public class TestMain {

    public static void main(String[] args) {
        Building building=new Building();
        ConcreteBuilder concreteBuilder= new ConcreteBuilder(building);
        Director director=new Director();
        director.createBuilding(concreteBuilder);

        System.out.println(building);
    }



}
