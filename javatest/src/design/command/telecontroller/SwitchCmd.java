package design.command.telecontroller;

public class SwitchCmd implements Command {

    private Device device;

    public SwitchCmd(Device device) {
        this.device = device;
    }

    @Override
    public void exe() {
        device.on();
    }

    @Override
    public void unexe() {
        device.off();
    }
}
