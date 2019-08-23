package design.visitor;


//访问者模式
public class Test {
    public static void main(String[] args) {
        Person man = new Man();
        Person women = new Women();

        ObjectStruct objectStruct = new ObjectStruct();
        objectStruct.add(man);
        objectStruct.add(women);

        Action success = new Success();
        Action failure = new Failure();

        objectStruct.display(success);
        objectStruct.display(failure);
    }
}
