package com.nampy.gof.prototype;

import javafx.scene.chart.PieChart;

import java.util.Date;

/**
 * @author nampy at 2020/1/13
 * @description 测试原型模式(浅克隆, 深克隆)
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(1123123L);
        Sheep s1 = new Sheep("少利", date);
        Sheep s2 = (Sheep) s1.clone();

        System.out.println(s1);
        System.out.println(s2);

        s2.setSname("多利");
        date.setTime(System.currentTimeMillis());
        System.out.println(s1);
        System.out.println(s2);
    }
}
