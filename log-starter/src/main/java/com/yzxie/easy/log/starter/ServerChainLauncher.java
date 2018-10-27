package com.yzxie.easy.log.starter;

import com.yzxie.easy.log.collector.LogCollectorServer;
import com.yzxie.easy.log.common.server.AbstractServer;

/**
 * @author xieyizun
 * @date 27/10/2018 23:38
 * @description:
 */
public final class ServerChainLauncher {
    private ServerChain serverChain = new ServerChain();

    public void init() {
        serverChain.init()
                    .setNextServer(new LogCollectorServer());
    }

    public void start() {
        serverChain.start();
    }

    public void stop() {
        serverChain.stop();
    }
}