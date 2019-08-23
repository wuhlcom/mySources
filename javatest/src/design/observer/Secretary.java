package design.observer;

import java.util.ArrayList;
import java.util.List;

public class Secretary implements Subject {

    private List<Observer> observers=new ArrayList<>();
    private String action;

    @Override
    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyMsg() {
        if (action=="come") {
            for (Observer observer : observers) {
                observer.update();
            }
        }else {
            System.out.println("继续监视。。。");
        }
    }
}
