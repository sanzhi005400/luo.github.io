package pkg.SchoolWork_01;

/**
 * @author: 罗仕杰
 * @date: 2022/11/20 15:13
 * @description:
 */
public class Airplane {//飞机类
    private String brand;
    private double speed;

    public Airplane(String brand, double speed) {
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
        return "飞机{" +
                "品牌是：'" + brand + '\'' +
                ", 速度是：" + speed +
                '}';
    }
}
