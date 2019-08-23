package design.facade;

//房地产
public class Realty  implements SuperStock{


    public void buy(){
        System.out.println("买入房产");
    }

    public void sell(){
        System.out.println("卖出房产");
    }
}
