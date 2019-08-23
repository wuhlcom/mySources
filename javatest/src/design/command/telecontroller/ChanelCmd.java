package design.command.telecontroller;

public class ChanelCmd implements Command {
    private Device device;

    public ChanelCmd(Device device) {
        this.device = device;
    }

    @Override
    public void exe() {
        device.chanelUP();
    }

    @Override
    public void unexe() {
        device.chaneldown();
    }
}
