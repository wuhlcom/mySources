package zhilutec.tio.dto;


import com.alibaba.fastjson.JSON;
import zhilutec.tio.dto.body.DownHeatbeatBody;
import zhilutec.tio.dto.body.DownJoinBody;
import zhilutec.utils.AesCmacTool;
import zhilutec.utils.ConstantUtil;
import zhilutec.utils.MspPacketTypeUtil;
import zhilutec.utils.MspPacketUtil;

public class PacketFactory implements IPacketFactory {

    @Override
    public BasePacket genPacket(String msgType) throws Exception {
        BasePacket basePacket = new BasePacket();
        switch (msgType) {
            case MspPacketTypeUtil.CMD_JOIN_DOWN:
                basePacket.setBody(genJoinBody());
                return basePacket;
            case MspPacketTypeUtil.CMD_HB_DOWN:
                basePacket.setBody(genHeartbeat());
                return basePacket;
            default:
                return basePacket;
        }
    }

    //生成join消息
    public byte[] genJoinBody() throws Exception {
        // 生成挑战字
        int appnonce = MspPacketUtil.getAppnonce();
        AesCmacTool mac = new AesCmacTool();
        String ckey = mac.genChallengeKey(ConstantUtil.appauthkey, ConstantUtil.appeui, appnonce);
        DownJoinBody mspJoinDownBody = new DownJoinBody();
        mspJoinDownBody.setCmd(MspPacketTypeUtil.CMD_JOIN_DOWN);
        mspJoinDownBody.setAppeui(ConstantUtil.appeui);
        mspJoinDownBody.setAppnonce(appnonce);
        mspJoinDownBody.setCmdseq(1);
        mspJoinDownBody.setChallenge(ckey);
        return genHex2Byte(JSON.toJSONString(mspJoinDownBody));
    }

    //生成心跳响应
    public byte[] genHeartbeat()   {
        return genHex2Byte(JSON.toJSONString(new DownHeatbeatBody()));
    }

    //拼接完整的16进制消息
    public static String genHexMsg(String msg)  {
        String msgBodyHex = MspPacketUtil.strTo16(msg);
        //begin--verion--len--body--end
        //0A---0102--len--body--00
        String msgHeadHex = "0A" + "0102" + MspPacketUtil.getMsgLenHex(msgBodyHex);
        String msgEnd = "00";
        String msgHex = msgHeadHex + msgBodyHex + msgEnd;
        return msgHex.toUpperCase();
    }

    //将16进制完整消息转为byte
    public static byte[] genHex2Byte(String msg)  {
        return MspPacketUtil.parseHexStr2Byte(genHexMsg(msg));
    }

}
