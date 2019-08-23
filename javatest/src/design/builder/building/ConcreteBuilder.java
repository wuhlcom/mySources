package design.builder.building;

public class ConcreteBuilder implements Builder {

    private Building building;

    public ConcreteBuilder(Building building) {
        this.building = building;
    }

    @Override
    public void buildBasic() {
        building.setBasic("打好基础");
    }


    @Override
    public void buildWalls() {
        building.setWall("砌墙");
    }


    @Override
    public void buildRoof() {
        building.setRoofed("封顶大吉");
    }

    @Override
    public Building buildBuilding() {
        return building;
    }

}
