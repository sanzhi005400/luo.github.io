package pkg.schoolWork_;

/**
 * @author: 罗仕杰
 * @date: 2022/11/19 20:25
 * @description:
 */
public class Car extends Vehicles{
    public Car(String type) {
        super(type);
    }

    @Override
    public void move() {
        System.out.println(getType() + "汽车" + "正在驾驶");
    }
}
