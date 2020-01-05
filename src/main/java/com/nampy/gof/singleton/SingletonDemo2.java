package com.nampy.gof.singleton;

/**
 * @author nampy at 2020/1/5
 * @Description: 懒汉式单例模式
 */
public class SingletonDemo2 {
    //类初始化时候不初始化这个对象
    private static SingletonDemo2 instance;

    private SingletonDemo2(){

    }
    //需要同步, 调用效率低
    public static synchronized SingletonDemo2 getInstance() {
        if (instance == null){
            instance = new SingletonDemo2();
        }
        return instance;
    }

}
