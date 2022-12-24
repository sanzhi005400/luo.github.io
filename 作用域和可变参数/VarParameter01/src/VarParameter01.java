/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/5 20:22
 */

//可变参数
//java允许将同一个类中  多个同名 同工能 但参数个数不同的方法，封装成一个方法
//基本语法
//访问修饰符 返回类型 方法名（数据类型... 形参名）{}


public class VarParameter01 {
    public static void main(String[] args) {
        HspMethod p1 = new HspMethod();
        System.out.println(p1.sum(1,2,3,4,5,6,7,8));
    }
}

class HspMethod{
    //可以计算两个数的和，三个数的和，四个数的和。。。。。
    public int sum(int... nums){//1.int。。。 表示接受的是可变参数，类型是int，既可以接受多个参数
        //2.使用可变参数时可以当做数组来使用 即nums 可以当做数组
        System.out.println("接受的参数个数="+nums.length);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
        }
        return count;
    }
}
