/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/5 20:34
 */
//可变参数的实参可以为0个或者任意多个
//可变参数的实参可以为数组
//可变参数的本质就是数组
//可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后
//一个形参列表中只能出现一个可变参数

public class VarParameterDetail {
    public static void main(String[] args) {
        int[] arr = {1,2,3};//可变参数的实参可以为数组
        M n1 = new M();
        n1.f1(arr);
    }
}
class M{
    public void f1(int... nums){//可变参数的实参可以为数组
        System.out.println("长度="+nums.length);
    }

    public void f2(String str,double... nums){
        //可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后
    }

    public void f3(String str,double... nums){
        //一个形参列表中只能出现一个可变参数
    }
}