package zhilutec.tio.dto.body;

import zhilutec.utils.MspPacketTypeUtil;

// {"cmd":"heartbeat_ack"}
public class DownHeatbeatBody extends BaseBody {
    public DownHeatbeatBody() {
        setCmd(MspPacketTypeUtil.CMD_HB_DOWN);
    }
}
