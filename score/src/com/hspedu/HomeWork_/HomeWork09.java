package com.hspedu.HomeWork_;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/11/3 21:27
 */
public class HomeWork09 {
    public static void main(String[] args) {
        LabeledPint labeledPint = new LabeledPint("Thursday",1923,230.07);
    }
}
class Point{
    private double x;
    private double y;

    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

class LabeledPint extends Point{
    private String Lab;

    public LabeledPint(String lab,double x,double y){
        super(x,y);
        this.Lab = lab;
    }

}