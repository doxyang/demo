package com.demo.mianshi;

/**
 * @author pan
 * @description runable接口的实现类
 * @date 2021-04-08 22:09
 */
public class RunableIml implements Runnable{
    @Override
    public void run() {
        System.out.println("我是runable实现类的run方法running");
    }

    public static void main(String[] args) {
        RunableIml runableIml = new RunableIml();
        Thread thread = new Thread(runableIml);
        thread.setName("hehei");
        thread.start();
        System.out.println("thread start");
    }
}
