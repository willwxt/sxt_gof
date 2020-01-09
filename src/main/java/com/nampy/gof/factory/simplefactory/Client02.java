package com.nampy.gof.factory.simplefactory;

/**
 * @author nampy at 2020/1/9
 * @Description: 简单工厂的模式下
 */
public class Client02 {     //调用者
    public static void main(String[] args) {
        Car c1 = CarFactory.createCar("奥迪");//调用者只需要知道工厂
        Car c2 = CarFactory.createCar("比亚迪");
        c1.run();
        c2.run();
    }
}
