package enum_demo;

public enum EnumDemo {
    SINGLE(1),
    DOUBLE(2),
    TRIPLE(3);

    private Integer kill;
    EnumDemo(Integer kill) {
        this.kill = kill;
    }

    public Integer getKill() {
        return kill;
    }

    public void setKill(Integer kill) {
        this.kill = kill;
    }
}
