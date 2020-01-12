package com.nampy.gof.factory.abstractFactory;

public class LowFactory implements CarFactory{
    public Engine createEngine() {
        return new LowEngine();
    }

    public Seat createSeat() {
        return new LowSeat();
    }

    public Tyre createTyre() {
        return new LowTyre();
    }
}
