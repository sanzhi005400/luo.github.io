package pkg.schoolWork_;

/**
 * @author: 罗仕杰
 * @date: 2022/11/19 20:23
 * @description:
 */
public abstract class Vehicles {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Vehicles(String type) {
        this.type = type;
    }

    public abstract void move();
}
