package com.nampy.gof.singleton;

/**
 * @author nampy at 2020/1/5
 * @Description: 饿汉式单例模式
 */
public class SingletonDemo1 {
    //类初始化时候立即加载这个对象
    //由于加载类时时线程安全的
    private static SingletonDemo1 instance = new SingletonDemo1();

    private SingletonDemo1(){

    }
    //方法不需要同步, 调用效率高
    public static SingletonDemo1 getInstance() {
        return instance;
    }

}
