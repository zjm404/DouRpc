package com.xilidou;

import com.xilidou.entity.RpcRequest;
import com.xilidou.entity.RpcResponse;
import com.xilidou.netty.NettyClient;
import com.xilidou.netty.handler.ClientHandler;

import java.net.InetSocketAddress;

public class Transporters {

    public static RpcResponse send(RpcRequest request) throws InterruptedException {

        NettyClient nettyClient = new NettyClient("127.0.0.1", 8080);

        nettyClient.connect(new InetSocketAddress("127.0.0.1",8080));

        RpcResponse send = nettyClient.send(request);

        return send;

    }

}
