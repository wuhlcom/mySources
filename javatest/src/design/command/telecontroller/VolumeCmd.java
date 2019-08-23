package design.command.telecontroller;

public class VolumeCmd implements Command {

    private Device device;

    public VolumeCmd(Device device) {
        this.device = device;
    }

    @Override
    public void exe() {
        device.volumeUP();
    }

    @Override
    public void unexe() {
        device.volumeDown();
    }
}
