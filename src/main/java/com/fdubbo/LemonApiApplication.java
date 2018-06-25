package com.fdubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Copyright (C) 2017-2018 https://www.htouhui.com - A project by dubbo
 *
 * @author xh.d
 * @since 2018/6/25 14:45
 */
public class LemonApiApplication {

    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"/dubbo/dubbo-lemon-producer.xml"});
        context.start();
        // press any key to exit
        System.in.read();
    }
}
