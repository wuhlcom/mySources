package design.facade;

import java.util.Arrays;
import java.util.List;

//基金组织代股民买股
public class Fund {
    List<SuperStock> stocks;
    NationalDept nationalDept;
    Realty realty;
    Stock stock;

    public Fund(SuperStock...stocks) {
        this.stocks= Arrays.asList(stocks);
    }

    public Fund() {
         this.nationalDept=new NationalDept();
         this.realty=new Realty();
         this.stock=new Stock();
    }

    public void buyFund(){
        nationalDept.buy();
        realty.buy();
        stock.buy();
    }

    public void sellFund(){
        nationalDept.sell();
        realty.sell();
        stock.sell();
    }

    public void buyAnyFund(){
        for (SuperStock superStock : stocks) {
            superStock.buy();
        }
    }

    public void sellAnyFund(){
        for (SuperStock superStock : stocks) {
            superStock.sell();
        }
    }
}
