package design.interpret;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Context context =new Context();
        List<AbstactExpression> ls=new ArrayList<>();
        ls.add(new TerminalExpression());
        ls.add(new TerminalExpression());
        ls.add(new TerminalExpression());
        ls.add(new NontermialExpression());
        ls.add(new TerminalExpression());

        for (AbstactExpression l : ls) {
            l.interprete(context);
        }
    }
}
