package com.nampy.gof.singleton;

/**
 * @author nampy at 2020/1/5
 * @Description: 枚举式单例模式
 * 枚举类天然就是单例的
 * JVM从根本上提供保障, 避免通过反射和反序列化生成新对象的漏洞
 * 唯一没有懒加载
 */
public enum SingletonDemo5 {

    //这个枚举元素, 本身就是单例对象 通过 SingletonDemo5.INSTANCE 就可以获取
    INSTANCE;

    //可以添加自己需要的操作
    public void singletonOperation(){}

}
