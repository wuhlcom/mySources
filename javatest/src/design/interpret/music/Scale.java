package design.interpret.music;

public class Scale extends Expression {
    @Override
    void excute(String key, double value) {
        String scale="";
        switch ((int)value)
        {
            case 1:
                scale="低音";
                break;
            case 2:
                scale="中音";
                break;
            case 3:
                scale="高音";
                break;

        }
        System.out.println(scale);
    }
}
