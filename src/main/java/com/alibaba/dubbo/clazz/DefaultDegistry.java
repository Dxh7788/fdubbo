package com.alibaba.dubbo.clazz;

/**
 * Copyright (C) 2017-2018 https://www.htouhui.com - A project by lemon-core
 *
 * @author xh.d
 * @since 2018/7/11 14:44
 */
public class DefaultDegistry{

    public static void main(String[] args) throws Exception{
        Degistry degistry = (Degistry)Class.forName("com.alibaba.dubbo.clazz.Degistry").newInstance();
        degistry.pry("dxh");
    }
}