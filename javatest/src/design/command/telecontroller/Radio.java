package design.command.telecontroller;

public class Radio implements Device {
    @Override
    public void chanelUP() {
        System.out.println("收音机上一个频道");
    }

    @Override
    public void chaneldown() {
        System.out.println("收音机下一个频道");
    }

    @Override
    public void volumeUP() {
        System.out.println("收音机音量加大");
    }

    @Override
    public void volumeDown() {
        System.out.println("收音机音量减小");
    }

    @Override
    public void on() {
        System.out.println("收音机开");
    }

    @Override
    public void off() {
        System.out.println("收音机关");
    }
}
