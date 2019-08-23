package design.visitor;

public class Man extends Person {
    @Override
    void accept(Action action) {
        action.getManConclusion(this);
    }
}
