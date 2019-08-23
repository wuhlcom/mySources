package zhilutec.tio;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.tio.client.ClientChannelContext;
import org.tio.client.ClientGroupContext;
import org.tio.client.ReconnConf;
import org.tio.client.TioClient;
import org.tio.client.intf.ClientAioHandler;
import org.tio.client.intf.ClientAioListener;
import org.tio.core.Node;
import org.tio.core.Tio;
import zhilutec.tio.dto.BasePacket;
import zhilutec.utils.ConstantUtil;

import javax.annotation.PreDestroy;
import java.io.FileInputStream;
import java.util.Properties;


/**
 * @author tanyaowu
 */
@Slf4j
public class MspClient {

    //服务器节点
    // public static Node serverNode = new Node(ConstantUtil.MSP_SERVER, ConstantUtil.MSP_PORT);
    //handler, 包括编码、解码、消息处理
    // public static final ThreadLocal<ClientAioHandler> tioClientHandler = ThreadLocal.withInitial(() -> {
    //     try {
    //         return new MspClientAioHandler();
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    //     return null;
    // });

    //事件监听器，可以为null，但建议自己实现该接口，可以参考showcase了解些接口
    public static ClientAioListener aioListener = null;
    //断链后自动连接的，不想自动连接请设为null
    // private static ReconnConf reconnConf = new ReconnConf(5000L);
    private static ReconnConf reconnConf = null;

    //一组连接共用的上下文对象
    // public static ClientGroupContext clientGroupContext = new ClientGroupContext(tioClientHandler.get(), aioListener, reconnConf);

    public static TioClient tioClient = null;
    public static ClientChannelContext clientChannelContext = null;

    private static MspClient appClient = null;

    public static MspClient getInstance() throws Exception {
        if (null == appClient) {
            Resource r = new ClassPathResource("msp-config.properties");
            Properties p = new Properties();
            p.load(new FileInputStream(r.getFile()));
            if (null != p.get("msp.server.ip") && null != p.get("msp.server.port")) {
                String mspIp = (String) p.get("msp.server.ip");
                Integer mspPort = (Integer) p.get("msp.server.port");
                if (null != mspIp && null != mspPort) {
                    appClient = new MspClient(mspIp, mspPort);
                }
            } else {
                if (null == appClient) {
                    appClient = new MspClient(ConstantUtil.MSP_SERVER, ConstantUtil.MSP_PORT);
                }
            }
        } else {

        }
        return appClient;
    }

    private MspClient(String serverIp, Integer port) throws Exception {
        ClientAioHandler tioClientHandler = new MspClientAioHandler();
        ClientGroupContext clientGroupContext = new ClientGroupContext(tioClientHandler, aioListener, reconnConf);
        clientGroupContext.setName("=msp-client=");
        // clientGroupContext.tokens.bind("dddd", clientChannelContext);
        // clientGroupContext.users.bind("abc", (ChannelContext) clientGroupContext);
        // clientGroupContext.setHeartbeatTimeout(ConstantUtil.TIMEOUT);
        //启动Tio服务
        tioClient = new TioClient(clientGroupContext);
        clientChannelContext = tioClient.connect(new Node(serverIp, port));
    }


    @PreDestroy
    public void destroy() {
        tioClient.stop();
    }

    /**
     * 发送消息
     *
     * @param packet
     * @throws Exception
     */
    public boolean send(BasePacket packet) {
        log.info("===msp clien==== send:{}", packet);
        return Tio.send(clientChannelContext, packet);
    }
}
