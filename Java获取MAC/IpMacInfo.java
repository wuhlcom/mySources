

public class IpMacInfo {
    private String hostname;//系统当前hostname
    private String ip;//ip地址
    private String ipnet;//网络类型
    private String os;//系统名称
    private String mac;//mac 地址
    private String cupArch; //cpu架构
    private String networkArch;  //网卡名称

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIpnet() {
        return ipnet;
    }

    public void setIpnet(String ipnet) {
        this.ipnet = ipnet;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getCupArch() {
        return cupArch;
    }

    public void setCupArch(String cupArch) {
        this.cupArch = cupArch;
    }

    public String getNetworkArch() {
        return networkArch;
    }

    public void setNetworkArch(String networkArch) {
        this.networkArch = networkArch;
    }

    @Override
    public String toString() {
        return "IpMacInfo{" +
                "hostname='" + hostname + '\'' +
                ", ip='" + ip + '\'' +
                ", ipnet='" + ipnet + '\'' +
                ", os='" + os + '\'' +
                ", mac='" + mac + '\'' +
                ", cupArch='" + cupArch + '\'' +
                ", networkArch='" + networkArch + '\'' +
                '}';
    }
}
