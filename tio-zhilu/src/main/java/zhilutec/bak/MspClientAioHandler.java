package zhilutec.bak;

import org.tio.client.intf.ClientAioHandler;
import org.tio.core.ChannelContext;
import org.tio.core.GroupContext;
import org.tio.core.exception.AioDecodeException;
import org.tio.core.intf.Packet;
import zhilutec.bak.demo.TCPClient;
import zhilutec.tio.dto.BasePacket;

import java.nio.ByteBuffer;

/**
 * @author tanyaowu
 */
public class MspClientAioHandler implements ClientAioHandler {
    private static BasePacket heartbeatPacket = new BasePacket();


    // 获取响应消息字符串
    public static String getResBody(byte[] resByte) {
        byte[] bodyLenByte = new byte[2];
        System.arraycopy(resByte, 3, bodyLenByte, 0, 2);
        int bodyLenInt = TCPClient.byteArrayToInt(bodyLenByte) - 1;// 最后一位为\0
        byte[] bodyByte = new byte[bodyLenInt];
        System.arraycopy(resByte, 5, bodyByte, 0, bodyLenInt);
        return new String(bodyByte);
    }

    /**
     * 解码：把接收到的ByteBuffer，解码成应用可以识别的业务消息包
     * 总的消息结构：消息头 + 消息体
     * 消息头结构：   5个字节，存储消息体的长度
     * 消息体结构：   对象的json串的byte[]
     */
    @Override
    public BasePacket decode(ByteBuffer buffer, int limit, int position, int readableLength, ChannelContext channelContext) throws AioDecodeException {
        //收到的数据组不了业务包，则返回null以告诉框架数据不够
        if (readableLength < BasePacket.HEADER_LENGHT + BasePacket.END_LENGHT) {
            return null;
        }
        //读取消息体的长度
        byte[] bytes = new byte[2];
        System.out.println("===============limit值为:" + limit);
        System.out.println("===============position值为:" + position);
        bytes[0] = buffer.get(3);
        bytes[1] = buffer.get(4);
        int bodyLength = TCPClient.byteArrayToInt(bytes);
        System.out.println("==============解码时收到消息中指定的长度为:" + bodyLength);
        //数据不正确，则抛出AioDecodeException异常
        if (bodyLength < 0) {
            throw new AioDecodeException("bodyLength [" + bodyLength + "] is not right, remote:" + channelContext.getClientNode());
        }
        //计算本次需要的数据长度
        int neededLength = BasePacket.HEADER_LENGHT + bodyLength;
        //收到的数据是否足够组包
        int isDataEnough = readableLength - neededLength;
        System.out.println("=============收到数据包长" + readableLength);
        System.out.println("=============需要包长" + neededLength);
        System.out.println("=============收到数据包长度差" + isDataEnough);
        // 不够消息体长度(剩下的buffe组不了消息体)
        if (isDataEnough < 0) {
            return null;
        }
        //else //组包成功
        // {
        //     HelloPacket imPacket = new HelloPacket();
        //     if (bodyLength > 0) {
        //         // byte[] dst = new byte[bodyLength];
        //         byte[] dst = new byte[neededLength];
        //         // buffer.get(dst,5,bodyLength);
        //         buffer.get(dst);
        //         imPacket.setBody(dst);
        //     }
        //     return imPacket;
        // }

        //组包成功
        BasePacket mspPacket = new BasePacket();
        if (bodyLength > 0) {
            byte[] dst = new byte[neededLength];
            buffer.get(dst);
            mspPacket.setBody(dst);
        }
        return mspPacket;
    }

    /**
     * 编码：把业务消息包编码为可以发送的ByteBuffer
     * 总的消息结构：消息头 + 消息体
     * 消息头结构：    4个字节，存储消息体的长度
     * 消息体结构：   对象的json串的byte[]
     */
    @Override
    public ByteBuffer encode(Packet packet, GroupContext groupContext, ChannelContext channelContext) {
        BasePacket helloPacket = (BasePacket) packet;
        byte[] body = helloPacket.getBody();
        int bodyLen = 0;
        if (body != null) {
            bodyLen = body.length;
        }

        //bytebuffer的总长度是 = 消息头的长度 + 消息体的长度
        // int allLen = HelloPacket.HEADER_LENGHT + bodyLen+HelloPacket.END_LENGHT;
        int allLen = bodyLen;
        //创建一个新的bytebuffer
        ByteBuffer buffer = ByteBuffer.allocate(allLen);
        //设置字节序
        buffer.order(groupContext.getByteOrder());
        // //写入消息头----消息头的内容就是消息体的长度
        // buffer.putInt(bodyLen);
        //写入消息体
        if (body != null) {
            buffer.put(body);
        }
        return buffer;
    }

    /**
     * 处理消息
     */
    @Override
    public void handler(Packet packet, ChannelContext channelContext) throws Exception {
        BasePacket helloPacket = (BasePacket) packet;
        byte[] body = helloPacket.getBody();
        if (body != null) {
            String str = new String(body, BasePacket.CHARSET);
            // String str = new String(body);
            // String bo =TCPClient.getResBody(body);
            System.out.println("收到消息：" + str);
            String str2 = getResBody(body);
            System.out.println("收到消息：" + str2);
        }

        return;
    }

    /**
     * 此方法如果返回null，框架层面则不会发心跳；如果返回非null，框架层面会定时发本方法返回的消息包
     */
    // @Override
    // public HelloPacket heartbeatPacket() {
    //     return heartbeatPacket;
    // }
    @Override
    public Packet heartbeatPacket(ChannelContext channelContext) {
        return heartbeatPacket;
    }
}
