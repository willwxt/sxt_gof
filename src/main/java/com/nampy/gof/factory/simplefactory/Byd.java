package com.nampy.gof.factory.simplefactory;

/**
 * @author nampy at 2020/1/9
 * @Description:
 */
public class Byd implements Car {
    @Override
    public void run() {
        System.out.println("比亚迪在跑!");
    }
}
