package zhilutec.bak;

import org.tio.core.intf.Packet;

/**
 * 中兴MSP平台消息解析
 *
 * @author whl
 */
public class MspPacket extends Packet {
    // private static final long serialVersionUID = -172060606924066412L;
    private static final long serialVersionUID = -1L;
    public static final int HEADER_LENGHT = 5;//消息头的长度
    public static final int END_LENGHT = 1;//消息尾的长度
    public static final String CHARSET = "utf-8";
    private byte[] body;

    /**
     * @return the body
     */
    public byte[] getBody() {
        return body;
    }

    /**
     * @param body the body to set
     */
    public void setBody(byte[] body) {
        this.body = body;
    }

    public static int getHeaderLenght() {
        return HEADER_LENGHT;
    }

    public static int getEndLenght() {
        return END_LENGHT;
    }

    public static String getCHARSET() {
        return CHARSET;
    }
}
