package pkg.schoolWork_;

/**
 * @author: 罗仕杰
 * @date: 2022/11/19 20:28
 * @description:
 */
public class Airplane extends Vehicles{
    public Airplane(String type) {
        super(type);
    }

    @Override
    public void move() {
        System.out.println(getType() + "的飞机" + "正在起飞");
    }
}
