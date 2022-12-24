import java.util.Scanner;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/11 20:24
 */
//讲对象作为参数传递的方法，（1）定义一个Circle类，包含一个double型的radius属性代表圆的半径，定义 findArea（）方法返回圆的面积
//（2）定义一个类PassObject，在类中定义一个方法printAreas（），该方法的定义如下：
//public void printAreas(Circle c，int times)  方法签名
//（3）在printAreas方法中打印输出1到times之间的每个整数半径值，以及对应的面积，例如，times为5，则输出半径1,2,3,4,5以及对应的圆面积
//（4）在main方法中调用printAreas（）方法，调用完毕后输出当前半径值
public class HomeWork11 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.findArea(2.5));

        PassObject c2 = new PassObject();
        c2.printAreas(c1, 5);

        //自动加变量名  加.var快捷键
        Scanner myScanner = new Scanner(System.in);

    }
}


class Circle {//一个圆类
    double radius;//半径

    public double findArea(double radius) {//定义 findArea（）方法返回圆的面积
        return (radius * radius * Math.PI);
    }
}

class PassObject {//定义一个类PassObject，在类中定义一个方法printAreas（）

    public void printAreas(Circle c, int times) {//方法签名

        //在printAreas方法中打印输出1到times之间的每个整数半径值，以及对应的面积
        System.out.println("Radius" + "\t" + "\t" + "Area");
        for (int i = 1; i <= times; i++) {
            System.out.print(i + "\t" + "\t" + "\t");
            System.out.print((i * i * 3.1415926));//打印每个整数
            System.out.println();
        }
    }

}
//查看类的继承关系ctrl+H
class person{
    String name;
    int age;
    //构造器快捷键 alt + insert;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public person() {
    }
}

