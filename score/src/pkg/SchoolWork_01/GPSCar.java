package pkg.SchoolWork_01;

import java.awt.*;
import java.awt.geom.Point2D;

/**
 * @author: 罗仕杰
 * @date: 2022/11/19 20:37
 * @description:
 */
/*2、实现接口本实验要求为普通的汽车增加GPS功能，实现移动中的汽车的GPS定位，汽车位置的变化由汽车时速决定。
        （1）可定义普通汽车Car类，包括属性汽车品牌（brand），汽车速度speed，添加相关构造函数和geter方法、seter方法。
        （2）可定义含定位功能的汽车类（GPSCar类），一方面继承普通汽车类，另一方面要具备GPS功能。
        （3）为方便扩展，本程序应不局限于汽车商品，飞机等交通工具也应具备GPS功能。
        （4）实现其功能，其中汽车的位置用Point类来获取。
        */

public class GPSCar extends Car implements GPS{//含有gps功能的汽车


    public GPSCar(String brand, double speed) {
        super(brand, speed);
    }

    @Override
    public void Location(Point point) {
        System.out.println(this.toString()+"\t当前位置: "+point.getAddress());
    }
}

