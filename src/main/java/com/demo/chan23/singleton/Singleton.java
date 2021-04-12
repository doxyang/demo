package com.demo.chan23.singleton;

/**
 * 1) 单例模式保证了 系统内存中该类只存在一个对象，节省了系统资源，对于一些需要频繁创建销毁的对象，使
 * 用单例模式可以提高系统性能
 * 2) 当想实例化一个单例类的时候，必须要记住使用相应的获取对象的方法，而不是使用 new
 * 3) 单例模式 使用的场景：需要 频繁的进行创建和销毁的对象、创建对象时耗时过多或耗费资源过多(即：重量级
 * 对象)，但又经常用到的对象、 工具类对象、频繁访问数据库或文件的对象(比如 数据源、session 工厂等)
 */
public class Singleton {
    private volatile static Singleton singleton = null;

    /**
     * 双重校验
     * @return
     */
    public static Singleton getInstance(){
        if (singleton == null) {
            synchronized (Singleton.class){
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    private Singleton() {
    }
}
