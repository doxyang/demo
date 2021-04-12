package com.demo.learn;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author pandaye
 * @description
 * @date 2021-04-06 23:18
 */
public class Learn {
    /*
    内存的分配方式不一样。String str="i"的方式，java 虚拟机会将其分配到常量池中；而 String str=new String("i") 则会被分到堆内存中。
     */
    String str = "i";
    String str2 = new String("i");

//    常见的异常类有哪些？

//    NullPointerException：当应用程序试图访问空对象时，则抛出该异常。
//    SQLException：提供关于数据库访问错误或其他错误信息的异常。
//    IndexOutOfBoundsException：指示某排序索引（例如对数组、字符串或向量的排序）超出范围时抛出。
//    NumberFormatException：当应用程序试图将字符串转换成一种数值类型，但该字符串不能转换为适当格式时，抛出该异常。
//    FileNotFoundException：当试图打开指定路径名表示的文件失败时，抛出此异常。
//    IOException：当发生某种I/O异常时，抛出此异常。此类是失败或中断的I/O操作生成的异常的通用类。
//    ClassCastException：当试图将对象强制转换为不是实例的子类时，抛出该异常。
//    ArrayStoreException：试图将错误类型的对象存储到一个对象数组时抛出的异常。
//    IllegalArgumentException：抛出的异常表明向方法传递了一个不合法或不正确的参数。
//    ArithmeticException：当出现异常的运算条件时，抛出此异常。例如，一个整数“除以零”时，抛出此类的一个实例。
//    NegativeArraySizeException：如果应用程序试图创建大小为负的数组，则抛出该异常。
//    NoSuchMethodException：无法找到某一特定方法时，抛出该异常。
//    SecurityException：由安全管理器抛出的异常，指示存在安全侵犯。
//    UnsupportedOperationException：当不支持请求的操作时，抛出该异常。
//    RuntimeExceptionRuntimeException：是那些可能在Java虚拟机正常运行期间抛出的异常的超类。

    public static void main(String[] args) {
        int count = 100000;
        // 数组查询快O(1) 删除添加时下标要变化比较耗时，从末尾添加删除，下标不变较快
        ArrayList<String> arrayList = new ArrayList<>();
        // 链表结构 添加删除快， 随机读取时间复杂度为 O(n)
        LinkedList<String> list = new LinkedList<>();

        Object o = Array.newInstance(String.class, 12);
        System.out.println(o.toString());
    }
}
