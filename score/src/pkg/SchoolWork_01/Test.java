package pkg.SchoolWork_01;

/**
 * @author: 罗仕杰
 * @date: 2022/11/20 23:57
 * @description:
 */
public class Test{
    public static void main(String[] args) {
        System.out.println("============汽车==============");
        GPSCar gpsCar = new GPSCar("宝马",120);
        Point point = new Point("北京");
        gpsCar.Location(point);


        System.out.println("\n===========飞机===============");
        GPSAirplane gpsAirplane = new GPSAirplane("波音747",300);
        Point point1 = new Point("厦门");
        gpsAirplane.Location(point1);
    }
}
