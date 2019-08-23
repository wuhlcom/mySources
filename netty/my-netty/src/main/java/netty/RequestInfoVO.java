package netty;

public class RequestInfoVO {
    private Byte type;
    private int sequence;
    private String msg;
    private String body;


    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }


    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
