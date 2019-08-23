package design.strategy;

//实例工厂,策略模式
public class CashContext {

    private CashSuper cs;

    public CashContext(CashSuper cs) {
        this.cs = cs;
    }

    public double getCash(double money){
        return cs.acceptCash(money);
    }
}
