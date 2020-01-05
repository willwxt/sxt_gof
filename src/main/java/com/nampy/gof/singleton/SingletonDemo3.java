package com.nampy.gof.singleton;

/**
 * @author nampy at 2020/1/5
 * @Description: 双重检测锁模式
 */
public class SingletonDemo3 {
    //类初始化时候不初始化这个对象
    private static SingletonDemo3 instance;

    private SingletonDemo3(){

    }

    public static synchronized SingletonDemo3 getInstance() {
        if (instance == null){
            SingletonDemo3 sc;
            synchronized (SingletonDemo3.class){
                sc = instance;
                if (sc == null){
                    synchronized (SingletonDemo3.class){
                        if (sc == null){
                            sc = new SingletonDemo3();
                        }
                    }
                    instance = sc;
                }
            }
        }
        return instance;
    }

}
