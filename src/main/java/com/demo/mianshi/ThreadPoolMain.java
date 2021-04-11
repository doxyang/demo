package com.demo.mianshi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.AbstractQueuedLongSynchronizer;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author pan
 * @description 线程池
 * @date 2021-04-09 23:22
 */
public class ThreadPoolMain {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor();
        ReentrantLock lock = new ReentrantLock();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        int i = atomicInteger.addAndGet(1);
        ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock readLock = readWriteLock.readLock();
        readLock.lock();
        readWriteLock.writeLock();
//        AbstractQueuedSynchronizer abstractQueuedSynchronizer = new AbstractQueuedLongSynchronizer();


    }
}
