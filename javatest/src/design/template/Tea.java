package design.template;

public class Tea extends Drinker {
    @Override
    public void brew() {
        System.out.println("将茶叶放入水中");
    }

    @Override
    public void addCondiments() {
        System.out.println("加柠檬");
    }
}
