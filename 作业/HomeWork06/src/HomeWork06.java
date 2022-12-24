/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/9 20:30
 */
//编程创造一个Cale计算类，在其中定义两个变量表示两个操作数，定义四个方法分别实现求和，差，积，商（要求除数为0的话要提示），并创造两个对象分别测试
public class HomeWork06 {
    public static void main(String[] args) {
        Cale c1 = new Cale(20,30);
        Cale c2 = new Cale(40,0);

        c1.sum(c1.x, c1.y);
        c1.multiplication(c1.x, c1.y);
        c1.subtraction(c1.x, c1.y);
        c1.division(c1.x, c1.y);

        c2.sum(c1.x, c1.y);
        c2.multiplication(c1.x, c1.y);
        c2.subtraction(c1.x, c1.y);
        c2.division(c1.x, c1.y);



    }
}

class Cale {
    double x;
    double y;

    public Cale(double x,double y){
        this.x = x;
        this.y = y;
    }

    public void sum(double x,double y){
        double sum = this.x + this.y;
        System.out.println("和为="+sum);
    }

    public void subtraction(double x,double y){
        double subtraction = this.x - this.y;
        System.out.println("差为="+subtraction);
    }

    public void multiplication(double x,double y){
        double multiplication = this.x * this.y;
        System.out.println("积="+multiplication);
    }

    public void division(double x,double y){
        if(this.y == 0){
            System.out.println("除数不能为0");
        }else {
            double division = this.x / this.y;
            System.out.println("商="+division);
        }
    }
}