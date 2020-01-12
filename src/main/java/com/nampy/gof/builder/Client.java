package com.nampy.gof.builder;

/**
 * @author nampy at 2020/1/12
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        AirShipDirector director = new SxtAirShipDirector(new SxtAirShipBuilder());

        AirShip airShip = director.directorAirShip();

        System.out.println(airShip.getEngine());

        airShip.launch();

    }
}
