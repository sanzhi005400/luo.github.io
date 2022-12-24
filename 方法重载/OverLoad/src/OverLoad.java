/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/5 19:15
 */
//java允许同一个类中，多个同名方法存在，但要求 形参列表不一致
// 减轻起名的麻烦，减轻记名的麻烦
public class OverLoad {
    public static void main(String[] args) {
        MyCalculate p1 = new MyCalculate();
        System.out.println(p1.calculate(10,20));
        System.out.println(p1.calculate(20,20.5));
        System.out.println(p1.calculate(10.5,20));
        System.out.println(p1.calculate(10,20,30));
    }
}

class MyCalculate{
    public int calculate(int n1,int n2){//计算两个整数的和
        return n1 + n2;
    }
    public double calculate(int n1,double n2){
        return n1 + n2;
    }
    public double calculate(double n1,int n2){
        return n1 + n2;

    }
    public double calculate(int n1,int n2,int n3){
        return n1 + n2 + n3;
    }
}
