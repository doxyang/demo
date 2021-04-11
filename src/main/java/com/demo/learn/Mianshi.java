package com.demo.learn;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author pan
 * @description
 * @date 2021-04-06 23:18
 */
public class Mianshi {
    /*
    内存的分配方式不一样。String str="i"的方式，java 虚拟机会将其分配到常量池中；而 String str=new String("i") 则会被分到堆内存中。
     */
    String str = "i";
    String str2 = new String("i");

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
