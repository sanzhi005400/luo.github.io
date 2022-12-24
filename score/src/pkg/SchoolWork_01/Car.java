package pkg.SchoolWork_01;

import java.awt.*;

/**
 * @author: 罗仕杰
 * @date: 2022/11/19 20:33
 * @description:
 */
public class Car{
    private String brand;
    private double speed;

    public Car(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "汽车{" +
                "品牌是：'" + brand + '\'' +
                ", 速度是：" + speed +
                '}';
    }
}
