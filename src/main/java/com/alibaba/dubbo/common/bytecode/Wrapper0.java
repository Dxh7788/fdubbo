package com.alibaba.dubbo.common.bytecode;


/**
 * Copyright (C) 2017-2018 https://www.htouhui.com - A project by dubbo
 *
 * @author xh.d
 * @since 2018/7/16 15:48
 */
public class Wrapper0 extends Wrapper {

    public static String[] pns;
    public static java.util.Map pts;
    public static String[] mns;
    public static String[] dmns;
    public static Class[] mts0;

    @Override
    public String[] getPropertyNames() {
        return pns;
    }

    @Override
    public Class<?> getPropertyType(String pn) {
        return (Class) pts.get(pn);
    }

    @Override
    public boolean hasProperty(String n) {
        return pts.containsKey(n);
    }

    @Override
    public Object getPropertyValue(Object o, String n) {
        com.fdubbo.rpc.impl.LogServiceImpl w;
        try {
            w = ((com.fdubbo.rpc.impl.LogServiceImpl) o);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
        throw new com.alibaba.dubbo.common.bytecode.NoSuchPropertyException("Not found property \"" + n + "\" filed or setter method in class com.fdubbo.rpc.impl.LogServiceImpl.");
    }

    @Override
    public void setPropertyValue(Object o, String n, Object v) {
        com.fdubbo.rpc.impl.LogServiceImpl w;
        try {
            w = ((com.fdubbo.rpc.impl.LogServiceImpl) o);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
        throw new com.alibaba.dubbo.common.bytecode.NoSuchPropertyException("Not found property \"" + v + "\" filed or setter method in class com.fdubbo.rpc.impl.LogServiceImpl.");
    }

    @Override
    public String[] getMethodNames() {
        return mns;
    }

    @Override
    public String[] getDeclaredMethodNames() {
        return dmns;
    }

    @Override
    public Object invokeMethod(Object o, String n, Class[] p, Object[] v) throws java.lang.reflect.InvocationTargetException {
        com.fdubbo.rpc.impl.LogServiceImpl w;
        try {
            w = ((com.fdubbo.rpc.impl.LogServiceImpl) o);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
        try {
            if ("showVersion".equals(n) && p.length == 1) {
                w.showVersion((java.lang.String) v[0]);
                return null;
            }
        } catch (Throwable e) {
            throw new java.lang.reflect.InvocationTargetException(e);
        }
        throw new com.alibaba.dubbo.common.bytecode.NoSuchMethodException("Not found method \"" + n + "\" in class com.fdubbo.rpc.impl.LogServiceImpl.");
    }
}
