package design.builder.building;

public class Director {

    public Building createBuilding(ConcreteBuilder concreteBuilder){
                concreteBuilder.buildBasic();
                concreteBuilder.buildWalls();
                concreteBuilder.buildRoof();
                return concreteBuilder.buildBuilding();
    }
}
