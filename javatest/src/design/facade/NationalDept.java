package design.facade;

//国债
public class NationalDept implements SuperStock {

    public void buy(){
        System.out.println("买入国债");
    }

    public void sell(){
        System.out.println("卖出国债");
    }
}
