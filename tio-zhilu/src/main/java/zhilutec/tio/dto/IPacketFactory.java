package zhilutec.tio.dto;

public interface IPacketFactory {
    BasePacket genPacket(String msgType) throws Exception;
}
