package com.nampy.gof.factory.simplefactory;

/**
 * @author nampy at 2020/1/9
 * @Description: 没有工厂模式的情况下
 */
public class Client01 {     //调用者
    public static void main(String[] args) {
        Car c1 = new Audi();    //你是个司机居然需要创建车
        Car c2 = new Byd();
        c1.run();
        c2.run();
    }
}
