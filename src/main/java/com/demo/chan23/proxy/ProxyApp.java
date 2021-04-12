package com.demo.chan23.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author pandaye
 * @description 代理测试执行类
 * @date 2021-04-12 23:02
 */
public class ProxyApp {
    public static void main(String[] args) {

        IAction action = new ActionPrintIml();
        InvocationHandler handle = new ProxyHandle(action);
        IAction iAction = (IAction) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), action.getClass().getInterfaces(), handle);
        iAction.doSomeThing();
    }
}
