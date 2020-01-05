package com.nampy.gof.singleton;

/**
 * @author nampy at 2020/1/5
 * @Description: 静态内部类式单例模式
 */
public class SingletonDemo4 {
    //只有使用时才加载内部类对象
    private static class SingletonClass {
        private static final SingletonDemo4 instance = new SingletonDemo4();
    }

    private SingletonDemo4(){

    }
    //方法不需要同步, 调用效率高
    public static SingletonDemo4 getInstance() {
        return SingletonClass.instance;
    }

}
