package design.observer;

public class StockObserver implements Observer {

    private String name;
    private Subject subject;

    public StockObserver(String name,Subject subject) {
        this.name=name;
        this.subject=subject;
    }


    @Override
    public void update() {
        System.out.println(this.name+"关闭股票软件");
    }
}
