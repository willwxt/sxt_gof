package com.nampy.gof.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author nampy at 2020/1/5
 * @Description: 懒汉式单例模式 测试如何防止反射和反序列化漏洞
 */
public class SingletonDemo6 implements Serializable {
    //类初始化时候不初始化这个对象
    private static SingletonDemo6 instance;

    private SingletonDemo6(){
        //如果使用反射多次调用, 直接抛出异常, 反之反射破解, 一般情况下不需要考虑
        if (instance != null){
            throw new RuntimeException();
        }
    }
    //需要同步, 调用效率低
    public static synchronized SingletonDemo6 getInstance() {
        if (instance == null){
            instance = new SingletonDemo6();
        }
        return instance;
    }
    //反序列化时, 如果定义了这个方法, 则直接调用这个方法返回执行对象, 而不需要再次创建对象!
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }

}
