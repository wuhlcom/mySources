package design.observer;

public class NBAObserver implements Observer {


    private String name;
    private Subject subject;

    public NBAObserver(String name,Subject subject) {
        this.subject = subject;
        this.name = name;
    }


    @Override
    public void update() {
        System.out.println(this.name+"关闭NBA播放");
    }
}
