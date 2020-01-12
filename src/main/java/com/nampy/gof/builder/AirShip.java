package com.nampy.gof.builder;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 宇宙飞船
 */
@Data
public class AirShip {
    private OrbitalModule orbitalModule; //轨道舱
    private Engine engine; //发动机
    private EscapeTower escapeTower; //逃逸塔

    public void launch(){
        System.out.println("飞船发射成功!");
    };

}

@Data
@AllArgsConstructor
class OrbitalModule{
    private String name;
}

@Data
@AllArgsConstructor
class Engine{
    private String name;
}

@Data
@AllArgsConstructor
class EscapeTower{
    private String name;
}