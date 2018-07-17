package com.alibaba.dubbo.seven.listener;

import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.Exporter;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.dubbo.rpc.listener.ExporterListenerAdapter;

/**
 * Copyright (C) 2017-2018 https://www.htouhui.com - A project by dubbo
 *
 * @author xh.d
 * @since 2018/7/16 17:31
 */
@Activate
public class SvExporterListenerAdapter extends ExporterListenerAdapter {

    @Override
    public void exported(Exporter<?> exporter) throws RpcException {
        Invoker invoker = exporter.getInvoker();
        System.out.println(invoker.getInterface().getName());
    }
}
