package design.command.telecontroller;

public interface Device extends Switchable {
    public void chanelUP();
    public void chaneldown();
    public void volumeUP();
    public void volumeDown();
}
