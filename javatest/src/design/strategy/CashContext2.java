package design.strategy;

//策略模式与工厂模式结合
public class CashContext2 {

    private CashSuper cs;

    public CashContext2(String condition) {
        switch (condition){
            case "正常收费":
                cs=new CashNormal();
                break;
            case "打8折":
                cs=new CashRebate(0.8);
                break;
            case "满400减100":
                cs=new CashReturn(400,300);
                break;
        }
    }

    public double getCash(double money){
        return cs.acceptCash(money);
    }
}
