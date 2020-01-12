package com.nampy.gof.builder;

/**
 * @author nampy at 2020/1/12
 * @Description:
 */
public class SxtAirShipBuilder implements AirShipBuilder {
    public Engine builderEngine() {
        System.out.println("构建sxt牌发动机!");
        return new Engine("sxt牌发动机");//可以向工厂要
    }

    public OrbitalModule builderOrbitalModule() {
        System.out.println("构建sxt牌轨道舱!");
        return new OrbitalModule("sxt牌轨道舱");
    }

    public EscapeTower builderEscapeTower() {
        System.out.println("构建sxt牌逃逸塔!");
        return new EscapeTower("sxt牌逃逸塔");
    }
}
