package com.demo.myutils;

import java.io.*;

/**
 * @author pandaye
 * @description 对象工具类
 * @date 2021-04-12 23:33
 */
public class MyObjectUtil {
    @SuppressWarnings("unchecked")
    public static <T extends Serializable> T clone(T obj)
            throws Exception {
        ObjectInputStream ois;
        try (ByteArrayOutputStream bout = new ByteArrayOutputStream()) {
            try (ObjectOutputStream oos = new ObjectOutputStream(bout)) {
                oos.writeObject(obj);
            }

            try (ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray())) {
                ois = new ObjectInputStream(bin);
            }
        }
        return (T) ois.readObject();

        /* 说明：调用ByteArrayInputStream
        或ByteArrayOutputStream对象的close方法没有任何意义
         这两个基于内存的流只要垃圾回收器清理对象就能够释放资源，
        这一点不同于对外部资源（如文件流）的释放*/
    }
}
