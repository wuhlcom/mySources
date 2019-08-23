package zhilutec.tio.dto;

import lombok.Data;
import org.tio.core.intf.Packet;

/**
 * 中兴MSP平台消息解析
 *
 * @author whl
 */
@Data
public class BasePacket extends Packet {
    // private static final long serialVersionUID = -172060606924066412L;
    private static final long serialVersionUID = -1L;
    public static final int HEADER_LENGHT = 5;//消息体头部的长度
    public static final int END_LENGHT = 1;//消息体尾部的长度
    public static final String CHARSET = "utf-8";
    private byte[] body;
}
