package com.fdubbo.rpc.impl;

import com.fdubbo.rpc.LogService;

/**
 * Copyright (C) 2017-2018 https://www.htouhui.com - A project by dubbo
 *
 * @author xh.d
 * @since 2018/6/25 14:36
 */
public class LogServiceImpl implements LogService {
    @Override
    public void showVersion(String name) {
        System.out.println("这是dxh的debbo首个版本!欢迎"+name);
    }
}
