package zhilutec.bak;

import com.alibaba.fastjson.JSONObject;
import zhilutec.bak.demo.AesCmacTool;
import zhilutec.bak.demo.TCPClient;
import zhilutec.utils.MspPacketUtil;

public class MsgHex {

    public static String genJoinMsg() throws Exception {
        // 生成挑战字
        int appnonce = TCPClient.getAppnonce();
        AesCmacTool mac = new AesCmacTool();
        String ckey = mac.genChallengeKey(ConstantUtil.appauthkey, ConstantUtil.appeui, appnonce);
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("cmd", "join");
        jsonObj.put("cmdseq", 12);
        jsonObj.put("appeui", ConstantUtil.appeui);
        jsonObj.put("appnonce", appnonce);
        jsonObj.put("challenge", ckey);
        return genHexMsg(jsonObj.toJSONString());
    }

    // 拼接发送的消息
    public static String genHexMsg(String msg) throws Exception {
        String msgBodyHex = TCPClient.strTo16(msg);
        //0A->'\n'--0102版本号---长度
        String msgHeadHex = "0A" + "0102" + MspPacketUtil.getMsgLenHex(msgBodyHex);
        String msgEnd = "00";
        String msgHex = msgHeadHex + msgBodyHex + msgEnd;
        return msgHex.toUpperCase();
    }

}

