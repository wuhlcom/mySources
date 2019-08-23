package design.interpret;

public class NontermialExpression extends AbstactExpression {
    @Override
    public void interprete(Context context) {
        System.out.println("非终端解释器");
    }
}
