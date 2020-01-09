package com.nampy.gof.factory.simplefactory;

/**
 * @author nampy at 2020/1/9
 * @Description:
 */
public class Audi implements Car {
    @Override
    public void run() {
        System.out.println("奥迪在跑!");
    }
}
