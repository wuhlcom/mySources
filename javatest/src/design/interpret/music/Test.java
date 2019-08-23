package design.interpret.music;


public class Test {
    public static void main(String[] args) {
        PlayContext context = new PlayContext();
        String text = "T 500 O 2 E 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ";
        System.out.println("上海滩：");
        System.out.println(text);
        context.setText(text);
        Expression expression = null;
        try {
            while (context.getText().length() > 0) {
                String str = context.getText().substring(0, 1);
                switch (str) {
                    case "O":
                        expression = new Scale();
                        break;
                    case "T":
                        expression = new Speed();
                        break;
                    case "C":
                    case "D":
                    case "E":
                    case "F":
                    case "G":
                    case "A":
                    case "B":
                        expression = new Note();
                        break;
                }
                expression.interpret(context);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
