package design.visitor;

public class Women extends Person {
    @Override
    void accept(Action action) {
        action.getManConclusion(this);
    }
}
