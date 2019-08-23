package classtest;

public class TestFruit {
    public static void main(String[] args) {
        //父类实例指向子类引用
        Fruit fruitApple = new Apple();
        fruitApple.smell();

        //直接new子类
        Apple apple = new Apple();
        apple.smell();

        Fruit fruit =new Fruit();
        fruit.appleTree();

        fruit.shape();
        fruitApple.shape();

    }
}
