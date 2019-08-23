package design.facade;

//外观模式，门面模式通过用于新系统与老系统对接，
// 在新系统和老系统之间增加一层外观模式，减少新老系统之间耦合
public class TestMain {
    public static void main(String[] args) {
        System.out.println("=====不通过基金来买股=====");
        NationalDept nationalDept =new NationalDept();
        Realty realty=new Realty();
        Stock stock=new Stock();

        nationalDept.buy();
        realty.buy();
        stock.buy();

        //卖出
        nationalDept.sell();
        realty.sell();
        stock.sell();

        System.out.println("=====通过基金来买股=====");
        //通过基金来买股
        Fund fund =new Fund();
        fund.buyFund();
        fund.sellFund();

    }
}
