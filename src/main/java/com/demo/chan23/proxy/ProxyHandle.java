package com.demo.chan23.proxy;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author pandaye
 * @description 实现类 代理程序控制类
 * @date 2021-04-12 22:55
 */
public class ProxyHandle implements InvocationHandler {
    private Object object;

    public ProxyHandle(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before ");
        method.invoke(object, args);
        System.out.println("after ");
        return null;
    }
}
