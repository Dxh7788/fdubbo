package com.fdubbo.proxy;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.ProxyFactory;
import com.alibaba.dubbo.rpc.RpcInvocation;
import com.fdubbo.rpc.LogService;
import com.fdubbo.rpc.impl.LogServiceImpl;

/**
 * Copyright (C) 2017-2018 https://www.htouhui.com - A project by dubbo
 *
 * @author xh.d
 * @since 2018/7/16 15:00
 */
public class ProxyRpcInvocationTest {

    private static final ProxyFactory proxyFactory = ExtensionLoader.getExtensionLoader(ProxyFactory.class).getAdaptiveExtension();
    public static void main(String[] args) {
        LogService ref = new LogServiceImpl();
        Invoker<?> invoker = proxyFactory.getInvoker(ref, LogService.class, new URL("registry","182.168.0.1",1234));
        RpcInvocation invocation = new RpcInvocation();
        invocation.setMethodName("showVersion");
        invocation.setArguments(new Object[]{"123"});
        invocation.setParameterTypes(new Class[]{String.class});
        invoker.invoke(invocation);
    }
}
