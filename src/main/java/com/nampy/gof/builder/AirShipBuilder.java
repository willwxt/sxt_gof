package com.nampy.gof.builder;

public interface AirShipBuilder {

    Engine builderEngine();

    OrbitalModule builderOrbitalModule();

    EscapeTower builderEscapeTower();
}
