package com.nampy.gof.adapter;
/**
 * @author nampy at 2020/1/20
 * @description 被适配的类 相当于例子中的PS/2键盘
 */
public class Adaptee {

    public void request(){
        System.out.println("可以完成客户需要的功能! 可以打字!");
    }
}
