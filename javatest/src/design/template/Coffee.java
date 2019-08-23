package design.template;

public class Coffee extends Drinker {
    @Override
    public void brew() {
        System.out.println("将咖啡加入到水中");
    }

    @Override
    public void addCondiments() {
        System.out.println("加牛奶和糖");
    }
}
