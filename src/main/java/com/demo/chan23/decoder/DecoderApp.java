package com.demo.chan23.decoder;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @author pandacoco
 * @description 装饰器
 * @date 2021-04-17 23:08
 */
public class DecoderApp {
//    java io流 装饰器模式
    /*
    * 按流向分为 输入流 输出流 输入到程序内 输出到程序外如文件
    * 按单位分为 字节流 字符流 1字符=2字节 1字节=8bit 一个中文占两个字节
    * 按功能分为 节点流 处理流 节点流为被装饰着 处理流对节点流或其他处理流的封装 装饰者模式
    * 字节流
    *   输入流 InputStream
    *       ByteArrayInputStream (节点流)
    *       PipedInputStream (节点流)
    *       FilterInputStream 装饰者，具体的装饰者都要继承它
    *           BufferedInputStream (处理流)
    *           DataInputStream (处理流)
    *           PrintStream
    *       FileInputStream (节点流)
    *       ObjectInputStream (节点流)
    *   输出流 OutputStream
    *
    * 字符流
    *   输入流 Reader
    *       CharArrayReader
    *       PipedReader
    *       FilterReader
    *       BufferedReader
    *       InputStreamReader
    *           FileReader
    *   输出流 Writer
    *       PrintWriter
    *
    * inputStream类的功能不足被Scanner解决了
    * OutputStream类的功能不足被PrintStream解决了
    * Reader类功能不足被BufferReader解决了
    * Writer类的功能不足被PrintWriter解决了
    * 输出数据用printStream，printwriter读取数据用Scanner其次是bufferReader
    * */

    public static void main(String[] args) {
        String string = "字节流";
        Scanner scanner = new Scanner("aaaaaa");
        boolean b = scanner.hasNext();
        System.out.println(b);
        try {
            PrintStream printStream = new PrintStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        CharArrayReader charArrayReader = new CharArrayReader(string.toCharArray());
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(string.getBytes(StandardCharsets.UTF_8));
        PipedInputStream pipedInputStream = new PipedInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(byteArrayInputStream);
//        try (FilterInputStream filterInputStream = new FilterInputStream(byteArrayInputStream)) {
//            filterInputStream.read();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            FileInputStream fileInputStream = new FileInputStream("");
        FileReader fileReader = new FileReader("fileInputStream");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new ByteArrayInputStream(string.getBytes(StandardCharsets.UTF_8)));
        DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(dataInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            int read = bufferedInputStream.read();
            System.out.println(read);
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileDescriptor fileDescriptor = new FileDescriptor();

    }
}
