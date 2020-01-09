package com.nampy.gof.factory.factoryMethod;

import com.nampy.gof.factory.simplefactory.Car;

/**
 * @author nampy at 2020/1/9
 * @Description: 现在新增奔驰的类, 不需要修改别的类, 只需要新增工厂类
 * 符合开闭原则 和工厂模式有相同的效果, 只不过更符合开闭原则, 但是会增加类的数量
 *
 */
public class Client {
    public static void main(String[] args) {
        Car c1 = new AudiFactory().createCar();
        Car c2 = new BydFactory().createCar();
        c1.run();
        c2.run();
    }
}
