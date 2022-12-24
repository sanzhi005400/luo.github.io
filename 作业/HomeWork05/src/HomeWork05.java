import java.util.Scanner;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/9 20:17
 */
//定义一个圆类Circle，定义属性：半径，提供显示圆周长功能的方法，提供显示圆面积的方法
public class HomeWork05 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("请输入圆的半径");
        double radius = myScanner.nextDouble();

        Circle c1 = new Circle(radius);
        System.out.println("周长"+c1.Perimeter());
        System.out.println();
        System.out.println("面积"+c1.Area());




    }
}

//有个math。pi

class Circle{//定义一个圆类Circle
    double radius;//定义属性：半径

    public Circle(double radius){
        this.radius = radius;
    }

    public double Perimeter(){
        return 2 * Math.PI * radius;

    }

    public double Area(){//面积计算
        return Math.PI * (radius * radius);
    }
}