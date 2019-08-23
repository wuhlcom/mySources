package classtest;

/**子类实例可以调用父类方法*/
public class Apple extends Fruit {

    private double weight;
    private double diameter;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void shape(){
        System.out.println("apple is rounded");
    }

    public  void  tree(){
        System.out.println("Apple tree");
    }
}
