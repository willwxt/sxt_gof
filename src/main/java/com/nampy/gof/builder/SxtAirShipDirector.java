package com.nampy.gof.builder;

import lombok.AllArgsConstructor;

/**
 * @author nampy at 2020/1/12
 * @Description:
 */
@AllArgsConstructor
public class SxtAirShipDirector implements AirShipDirector {

    private AirShipBuilder builder;

    public AirShip directorAirShip() {
        Engine e = builder.builderEngine();
        OrbitalModule o = builder.builderOrbitalModule();
        EscapeTower t = builder.builderEscapeTower();

        //装配成飞船对象
        AirShip airShip = new AirShip();
        airShip.setEngine(e);
        airShip.setEscapeTower(t);
        airShip.setOrbitalModule(o);

        return airShip;
    }
}
