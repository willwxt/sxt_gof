package com.nampy.gof.factory.abstractFactory;

public interface Engine {
    void run();
    void start();
}

class LuxuryEngine implements Engine{
    public void run() {
        System.out.println("跑得快");
    }

    public void start() {
        System.out.println("启动快,可以自动启停");
    }
}

class LowEngine implements Engine{
    public void run() {
        System.out.println("跑得慢");
    }

    public void start() {
        System.out.println("启动慢");
    }
}