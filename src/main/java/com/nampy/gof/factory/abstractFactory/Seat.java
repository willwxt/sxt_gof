package com.nampy.gof.factory.abstractFactory;

public interface Seat {
    void massage();
}

class LuxurySeat implements Seat{
    public void massage() {
        System.out.println("可以自动按摩");
    }
}

class LowSeat implements Seat{
    public void massage() {
        System.out.println("没有按摩功能");
    }
}
