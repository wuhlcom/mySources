package zhilutec.tio;

import zhilutec.tio.dto.BasePacket;
import zhilutec.tio.dto.IPacketFactory;
import zhilutec.tio.dto.PacketFactory;
import zhilutec.utils.MspPacketTypeUtil;

/**
 * @author tanyaowu
 */
public class MspClientStarter {

    /**
     * 启动程序入口
     */
    public static void main(String[] args) throws Exception {
        IPacketFactory packetFactory = new PacketFactory();
        BasePacket basePacket = packetFactory.genPacket(MspPacketTypeUtil.CMD_JOIN_DOWN);
        MspClient mspClient = MspClient.getInstance();
        mspClient.send(basePacket);
    }
}
