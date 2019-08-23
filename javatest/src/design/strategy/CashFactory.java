package design.strategy;

//折扣处理,静态工厂，解决子对象创建的问题
public class CashFactory {


    public static CashSuper getCash(String condition){
        CashSuper cashSuper=null;
        switch (condition){
            case "正常收费":
                cashSuper=new CashNormal();
                break;
            case "打8折":
                cashSuper=new CashRebate(0.8);
                break;
            case "满400减100":
                cashSuper=new CashReturn(400,300);
                break;
        }
        return cashSuper;
    }


    //直接返回折后价格
    public static double getCashMoney(String condition,double money){
        CashSuper cashSuper=null;
        switch (condition){
            case "正常收费":
                cashSuper=new CashNormal();
                break;
            case "打8折":
                cashSuper=new CashRebate(0.8);
                break;
            case "满400减100":
                cashSuper=new CashReturn(400,300);
                break;
        }
        return  cashSuper.acceptCash(money);
    }
}

