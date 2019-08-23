package design.observer;


public interface Subject {
    public void setAction(String action);

    public void attach(Observer observer);

    public void detach(Observer observer);

    public void notifyMsg();
}
