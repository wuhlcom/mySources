package design.observer;

public class TestObserver {
    public static void main(String[] args) {
        Subject subject =new Secretary();
        Observer observer1=new NBAObserver("小张",subject);
        Observer observer2=new StockObserver("小李",subject);
        subject.attach(observer1);
        subject.attach(observer2);
        subject.setAction("come1");
        subject.notifyMsg();
    }
}
