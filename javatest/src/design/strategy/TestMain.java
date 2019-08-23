package design.strategy;

public class TestMain {

    public static void main(String[] args) {
        String condition ="正常收费";
        double money=0;
        //策略模式，创建子类的逻辑在客户端
        money =clientGetCash(condition);
        System.out.println(money);

        //策略+工厂，将创建子类的逻辑放在服务端
        CashContext2 cashContext2=new CashContext2(condition);
        money=cashContext2.getCash(200);
        System.out.println(money);

        //静态工厂+策略模式
        money =CashFactory.getCashMoney(condition,300);
        System.out.println(money);
    }

    //策略模式，创建子类的逻辑在客户端
    public static double clientGetCash(String condition){
        CashContext cashContext=null;
        switch (condition){
            case "正常收费":
                cashContext=new CashContext(new CashNormal());
                break;
            case "打8折":
                cashContext=new CashContext(new CashRebate(0.8));
                break;
            case "满300减100":
                cashContext=new CashContext(new CashReturn(300, 100));
                break;

        }
        return cashContext.getCash(100);
    }
}
