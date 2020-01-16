package com.nampy.gof.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author nampy at 2020/1/13
 * @description 1997年克隆羊多利
 */
@AllArgsConstructor
@Data
public class Sheep implements Cloneable, Serializable {
    private String sname;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //直接调用Object的clone方法!
        Object obj = super.clone();

        //添加如下代码实现深克隆deep clone, 如果没有就是浅克隆
        Sheep s = (Sheep) obj;
        s.birthday = (Date) this.birthday.clone(); //把属性也进行克隆

        return obj;
    }
}
