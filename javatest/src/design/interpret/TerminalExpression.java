package design.interpret;

public class TerminalExpression extends AbstactExpression {
    @Override
    public void interprete(Context context) {
        System.out.println("终端解释器");
    }
}
