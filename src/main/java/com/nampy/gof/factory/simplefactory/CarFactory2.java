package com.nampy.gof.factory.simplefactory;

/**
 * @author nampy at 2020/1/9
 * @Description: 影响了开闭原则, 需要修改类. 但是你往往不是写jdk, 而是
 *  小项目, 所以很多时候也无所谓了
 */
public class CarFactory2 {

    public static Car createAudi(){
        return new Audi();
    }
    public static Car createByd(){
        return new Byd();
    }

}
