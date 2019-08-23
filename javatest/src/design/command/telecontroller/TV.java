package design.command.telecontroller;

public class TV implements Device {
    @Override
    public void chanelUP() {
        System.out.println("电视机上一个频道");
    }

    @Override
    public void chaneldown() {
        System.out.println("电视机下一个频道");
    }

    @Override
    public void volumeUP() {
        System.out.println("电视机音量加大");
    }

    @Override
    public void volumeDown() {
        System.out.println("电视机音量减小");
    }

    @Override
    public void on() {
        System.out.println("电视机开");
    }

    @Override
    public void off() {
        System.out.println("电视机关");
    }
}
