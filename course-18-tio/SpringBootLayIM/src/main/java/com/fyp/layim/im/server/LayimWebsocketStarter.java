package com.fyp.layim.im.server;

import com.fyp.layim.im.server.handler.LayimMsgHandler;
import com.fyp.layim.im.server.config.LayimServerConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.server.ServerGroupContext;

import java.io.IOException;

/**
 * @author fyp
 * @crate 2017/11/19 18:32
 * @project SpringBootLayIM
 */
public class LayimWebsocketStarter {
    private static Logger logger = LoggerFactory.getLogger(LayimWebsocketStarter.class);

    private LayimServerStarter layimServerStarter;
    private ServerGroupContext serverGroupContext;

    public LayimWebsocketStarter(LayimServerConfig layimServerConfig) throws Exception {
        //LayimServerStarter构造方法里面初始化了很多信息
        layimServerStarter = new LayimServerStarter(layimServerConfig, new LayimMsgHandler());

        //后期配置上下文
        serverGroupContext = layimServerStarter.getServerGroupContext();
    }

    public LayimServerStarter getWsServerStarter() {
        return layimServerStarter;
    }

    public void start() throws IOException {
        layimServerStarter.start();
    }

    /**

     * @return the serverGroupContext

     */
    public ServerGroupContext getServerGroupContext() {
        return serverGroupContext;
    }

}
