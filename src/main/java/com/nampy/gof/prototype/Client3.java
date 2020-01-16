package com.nampy.gof.prototype;

import lombok.NoArgsConstructor;

/**
 * @author nampy at 2020/1/16
 * @description 测试原型模式拷贝和new新对象的效率
 * 如果需要短时间创建大量对象, 并且new的过程比较耗时, 则可以考虑使用原型模式!
 */
public class Client3 {

    public static void testNew(int size) throws InterruptedException {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            Laptop t = new Laptop();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void testClone(int size) throws CloneNotSupportedException, InterruptedException {
        long start = System.currentTimeMillis();
        Laptop t = new Laptop();
        for (int i = 0; i < size; i++) {
            Laptop temp = (Laptop) t.clone();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        testNew(1000);
        testClone(1000);
    }
}

class Laptop implements Cloneable {
    public Laptop() throws InterruptedException {
        //Thread.sleep(10);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
