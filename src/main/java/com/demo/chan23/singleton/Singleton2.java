package com.demo.chan23.singleton;

/**
 * @author pan
 * @description 单例模式2
 * @date 2021-04-04 23:41
 * @deprecated
 */
public class Singleton2 {
    private static Singleton2 singleton2;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
