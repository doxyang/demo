package com.demo.chan23.proxy;

/**
 * @author pandaye
 * @description 打印实现类
 * @date 2021-04-12 22:36
 */
public class ActionPrintIml implements IAction,ICheck{
    @Override
    public void doSomeThing() {
        System.out.println("打印一条消息");
    }

    @Override
    public void doCheck() {
        System.out.println("检查信息");
    }
}
