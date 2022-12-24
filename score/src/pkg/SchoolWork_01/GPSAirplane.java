package pkg.SchoolWork_01;

import java.awt.*;

/**
 * @author: 罗仕杰
 * @date: 2022/11/20 15:36
 * @description:
 */
public class GPSAirplane extends Airplane implements GPS{//具有GPS的飞机类
    public GPSAirplane(String brand, double speed) {
        super(brand, speed);
    }

    @Override
    public void Location(Point point) {
        System.out.println(this.toString()+"\t当前位置: "+point.getAddress());
    }
}
