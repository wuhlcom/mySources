import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.*;


public class NetUtils {
    /**
     * 获取本地IP列表（针对多网卡情况）
     *
     * @return
     */
    public static List<IpMacInfo> getLocalInetMac() {
        List<IpMacInfo> ipMacInfoList = new ArrayList<>();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface
                    .getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = networkInterfaces
                        .nextElement();
                Enumeration<InetAddress> inetAddresses = networkInterface
                        .getInetAddresses();

                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddress = inetAddresses.nextElement();
                    IpMacInfo ipMacInfo = pickInetAddress(inetAddress, networkInterface);
                    if (ipMacInfo != null) {     
                        System.out.println(ipMacInfo);					
                        ipMacInfoList.add(ipMacInfo);
                    }
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
        return ipMacInfoList;
    }

    private static IpMacInfo pickInetAddress(InetAddress inetAddress, NetworkInterface ni) {
        try {
            String ip = inetAddress.getHostAddress();
            byte[] macBuf = ni.getHardwareAddress();
            if (!ni.isLoopback() && ni.isUp() && ip != null && ip.length() > 0 && macBuf.length > 0) {
                // String name = ni.getDisplayName()
                // if (name.contains("Adapter")
                //         || name.contains("Virtual") || name.contains("VMnet") || name.contains("#")) {
                //     return null;
                // }
                // if (ni.isVirtual() || !ni.isUp() || !ni.supportsMulticast()) {
                //     return null;
                // }
                if (inetAddress.isSiteLocalAddress()) {
                    Formatter formatter = new Formatter();
                    String sMAC = null;
                    for (int i = 0; i < macBuf.length; i++) {
                        sMAC = formatter.format(Locale.getDefault(), "%02X%s",
                                macBuf[i], (i < macBuf.length - 1) ? ":" : "")
                                .toString().toUpperCase();
                    }
                    formatter.close();
                    IpMacInfo ipMacInfo = new IpMacInfo();
                    ipMacInfo.setHostname(inetAddress.getHostName());
                    ipMacInfo.setMac(sMAC);
                    ipMacInfo.setIp(ip);
                    ipMacInfo.setIpnet(inetAddressTypeName(inetAddress));
                    ipMacInfo.setOs(System.getProperty("os.name"));
                    ipMacInfo.setCupArch(System.getProperty("os.name"));
                    ipMacInfo.setNetworkArch(ni.getDisplayName());
                    return ipMacInfo;
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String inetAddressTypeName(InetAddress inetAddress) {
        return (inetAddress instanceof Inet4Address) ? "ipv4" : "ipv6";
    }

    public static void main(String[] args) {
       System.out.println( getLocalInetMac());
    }

}
