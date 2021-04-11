package com.demo.mianshi;


import javax.script.ScriptException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author pan
 * @description callable实现类
 * @date 2021-04-08 22:22
 */
public class CallableIml implements Callable {

    @Override
    public Object call() throws Exception {
        System.out.println("callable 实现类call方法！");
        return null;
    }

    public static void main(String[] args) {
        CallableIml callableIml = new CallableIml();
        FutureTask<Object> objectFutureTask = new FutureTask<Object>(callableIml);
        Thread thread = new Thread(objectFutureTask);
        thread.start();
    }

}
