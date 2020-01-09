package com.nampy.gof.factory.factoryMethod;

import com.nampy.gof.factory.simplefactory.Audi;
import com.nampy.gof.factory.simplefactory.Car;

/**
 * @author nampy at 2020/1/9
 * @Description:
 */
public class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}
