package design.strategy;

//返现
public class CashReturn extends  CashSuper {

    //满额,eg满300返50
    private double moneyCondition=0;
    //返现额度
    private double moneyReturn=0;

    public CashReturn(double moneyCondition,double moneyReturn) {
        this.moneyReturn = moneyReturn;
        this.moneyCondition=moneyCondition;
    }

    //返回返现抵扣后的价格
    @Override
    public double acceptCash(double money) {
        Integer returnTimes= (int) (money/moneyCondition);
        return money-moneyReturn*returnTimes;
    }
}
