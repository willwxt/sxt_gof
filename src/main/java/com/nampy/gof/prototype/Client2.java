package com.nampy.gof.prototype;

import java.io.*;
import java.util.Arrays;
import java.util.Date;

/**
 * @author nampy at 2020/1/16
 * @description 原型模式, 使用序列化实现深克隆
 */
public class Client2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Date date = new Date(1123123L);
        Sheep s1 = new Sheep("少利", date);// 序列化需要这个类实现Serializable接口
        System.out.println(s1);

        //使用序列化和反序列化实现深复制
        ByteArrayOutputStream bos = new ByteArrayOutputStream();// 序列化到一个数组, 当然也可以序列化到文件
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(s1);//把s1对象数据写入bos
        byte[] bytes = bos.toByteArray(); //通过bos写入数组bytes
        System.out.println(Arrays.toString(bytes));

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Sheep s2 = (Sheep) ois.readObject();

        date.setTime(System.currentTimeMillis());
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

    }
}
