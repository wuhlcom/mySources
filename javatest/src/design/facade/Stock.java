package design.facade;

//股票
public class Stock  implements SuperStock{

    public void buy(){
        System.out.println("买入股票");
    }

    public void sell(){
        System.out.println("卖出股票");
    }
}
