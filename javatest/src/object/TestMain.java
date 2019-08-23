package object;

public class TestMain {

    public static void main(String[] args){
        Variable v1 = new Variable();
        Variable v2 = new Variable();
        /**static variable*/
        v1.getV_Static();
        v1.setV_Static("ni hao");
        v2.getV_Static();
        /**collections.list*/
        v1.listAdd(1);
        v1.listAdd2(1);
        v1.getNumbers();


        // v1.collections.set("1");
        // v1.getV();
        // v1.set2("2");
        // v1.getV();

        // v2.getV();
    }
}
