package com.demo.chan23.singleton;

/**
 * 1) 单例模式保证了 系统内存中该类只存在一个对象，节省了系统资源，对于一些需要频繁创建销毁的对象，使
 * 用单例模式可以提高系统性能
 * 2) 当想实例化一个单例类的时候，必须要记住使用相应的获取对象的方法，而不是使用 new
 * 3) 单例模式 使用的场景：需要 频繁的进行创建和销毁的对象、创建对象时耗时过多或耗费资源过多(即：重量级
 * 对象)，但又经常用到的对象、 工具类对象、频繁访问数据库或文件的对象(比如 数据源、session 工厂等)
 *
 * @author panda
 */
public class Singleton {

    private String string;

    //region 双重校验

    /*
其实在jvm里面的执行分为三步：
1.在堆内存开辟内存空间。
2.在堆内存中实例化SingleTon里面的各个参数。
3.把对象指向堆内存空间。
由于jvm存在乱序执行功能，
所以可能在2还没执行时就先执行了3，
如果此时再被切换到线程B上，由于执行了3，INSTANCE 已经非空了，会被直接拿出来用，
这样的话，就会出现异常。这个就是著名的DCL失效问题。

volatile确保INSTANCE每次均在主内存中读取，就可解决DCL失效问题。
这样虽然会牺牲一点效率，但也无伤大雅。
*/

    private volatile static Singleton singleton = null;

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
    //endregion

    private Singleton() {
    }

    // region [懒汉 线程安全]

    private static Singleton singleton2;

    public static synchronized Singleton getInstance2() {
        if (singleton2 == null) {
            singleton2 = new Singleton();
        }
        return singleton2;
    }
    // region
}
