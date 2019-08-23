package zhilutec.utils;


// --->>>{"cmd":"join_ack","cmdseq":12,"appeui":"2c26c5007e000010","code":200,"msg":"JOIN ACCEPT"}
// --->>>{"cmd":"heartbeat","appeui":"2c26c5007e000010"}
// --->>>{"cmd":"heartbeat","appeui":"2c26c5007e000010"}
// --->>>{"cmd":"forced_quit","appeui":"2c26c5007e000010","warning":"LOSE HEARTBEAT MESSAGE"}
public interface MspPacketTypeUtil {
    public static final String CMD_JOIN_DOWN = "join";
    public static final String CMD_HB_DOWN = "heartbeat_ack";
    public static final String CMD_HB_UP= "heartbeat";
}
