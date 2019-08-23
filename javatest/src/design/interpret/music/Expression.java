package design.interpret.music;

//O 3 E 0.5 G 0.5 A 3
abstract public class Expression {

    public void interpret(PlayContext context) {

        if (context.getText()==null||context.getText().length()==0) {
            return;
        } else {
            context.setText(context.getText().trim());
            String playKey = context.getText().substring(0, 1);
            context.setText(context.getText().substring(2));
            // System.out.println("剩余字符："+context.getText()+"||");
            // System.out.println("索引："+context.getText().indexOf(" "));
            double playValue=0;
            if (context.getText().indexOf(" ")!=-1) {
                 playValue = Double.valueOf(context.getText().substring(0, context.getText().indexOf(" ")));
                context.setText(context.getText().substring(context.getText().indexOf(" ") + 1));
            }else {
                 playValue = Double.valueOf(context.getText().substring(0, 1));
                context.setText("");
            }

            excute(playKey, playValue);
        }
    }

    abstract void excute(String key, double value);
}
