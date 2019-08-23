package zhilutec.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

/**
 * 说明：
 *
 * @author <a href="http://www.waylau.com">waylau.com</a> 2015年11月11日
 */
public class ProtocolDecoder extends LengthFieldBasedFrameDecoder {
    private static final int HEADER_SIZE = 5;

    private byte begin;    // 魔数
    private short version;    // 消息类型
    private short len;    // // 长度

    /**
     * @param maxFrameLength
     * @param lengthFieldOffset
     * @param lengthFieldLength
     * @param lengthAdjustment
     * @param initialBytesToStrip
     */
    public ProtocolDecoder(int maxFrameLength, int lengthFieldOffset,
                           int lengthFieldLength, int lengthAdjustment, int initialBytesToStrip) {
        super(maxFrameLength, lengthFieldOffset, lengthFieldLength,
                lengthAdjustment, initialBytesToStrip);
    }

    /**
     * @param maxFrameLength
     * @param lengthFieldOffset
     * @param lengthFieldLength
     * @param lengthAdjustment
     * @param initialBytesToStrip
     * @param failFast
     */
    public ProtocolDecoder(int maxFrameLength, int lengthFieldOffset,
                           int lengthFieldLength, int lengthAdjustment,
                           int initialBytesToStrip, boolean failFast) {
        super(maxFrameLength, lengthFieldOffset, lengthFieldLength,
                lengthAdjustment, initialBytesToStrip, failFast);
        // TODO Auto-generated constructor stub
    }


    @Override
    protected ProtocolMsg decode(ChannelHandlerContext ctx, ByteBuf in2) throws Exception {
        ByteBuf in = (ByteBuf) super.decode(ctx, in2);
        if (in == null) {
            return null;
        }

        if (in.readableBytes() < HEADER_SIZE) {
            return null;// response header is 10 bytes
        }

        begin = in.readByte();
        version = in.readShort();
        len = in.readShort();
        if (in.readableBytes() < len) {
            return null; // until we have the entire payload return
        }

        ByteBuf buf = in.readBytes(len);
        byte[] req = new byte[buf.readableBytes()];
        buf.readBytes(req);
        String body = new String(req, "UTF-8");
        ProtocolMsg msg = new ProtocolMsg();
        ProtocolHeader protocolHeader = new ProtocolHeader(begin, version, len);
        msg.setBody(body);
        msg.setProtocolHeader(protocolHeader);
        return msg;
    }
}
