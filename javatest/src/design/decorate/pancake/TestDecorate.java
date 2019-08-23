package design.decorate.pancake;

public class TestDecorate {

    public static void main(String[] args) {
        Pancake tornCake= new TornCake();
        //手抓饼基础价
        System.out.println(String.format("%s ￥ %s",tornCake.getDesc(),tornCake.price()));
        Pancake roujiamo=new Roujaimoe();
        roujiamo=new FiredEgg(roujiamo);
        roujiamo=new FiredEgg(roujiamo);
        roujiamo=new Ham(roujiamo);
        roujiamo=new MeatFloss(roujiamo);
        roujiamo=new Cucumber(roujiamo);
        //
        System.out.println(String.format("%s ￥ %s",roujiamo.getDesc(),roujiamo.price()));

    }


}
