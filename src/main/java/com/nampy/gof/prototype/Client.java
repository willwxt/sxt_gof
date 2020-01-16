package com.nampy.gof.prototype;

import java.util.Date;

/**
 * @author nampy at 2020/1/13
 * @Description 测试原型模式(浅克隆, 深克隆)
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(1123123L);
        Sheep s1 = new Sheep("少利", date);
        Sheep s2 = (Sheep) s1.clone();// 克隆需要这个类实现cloneable接口

        System.out.println(s1);
        System.out.println(s2);

        s2.setSname("多利");//别忘了String的设计上就是不可修改的, 不会改变堆中原有的对象, 而是新增新String对象
        date.setTime(System.currentTimeMillis());//date作为堆中的对象被修改了
        System.out.println(s1);
        System.out.println(s2);
    }
}
