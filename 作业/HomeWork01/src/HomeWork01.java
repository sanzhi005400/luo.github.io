import java.util.Scanner;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/9 18:45
 */
//1.编写类A01，定义方法max，实现求某个double数组的最大值，并返回

public class HomeWork01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);


        System.out.println("请输入元素");
        double[] number = {1,1.4,1.5,22,88};//有元素的情况
//        double[] number = {};//如果没有元素的话
        A01 a01 = new A01();
        Double res = a01.max(number);
        if(res != null){
            System.out.println("最大值="+res);
        }else {
            System.out.println("输入有误");
        }

    }
}

//class A01{修改之前的代码
//问题是如果主函数的数组里没有元素会如何
//
////保证number至少有一个元素
//    //保证代码的健壮性
//    //方法求最大值
//    public double max(double[] map){
//        if (map.length > 0) {
//            double max = map[0];
//            for (int i = 1; i < map.length; i++) {
//                if (max < map[i]) {
//                    max = map[i];
//                }
//            }
//            return max;
//        }else{
//            return
//        }
//    }
//}

class A01{

    //保证number至少有一个元素
    //保证代码的健壮性
    //方法求最大值
    public Double max(double[] map){//返回一个Double类
        //先判断map是否为空，然后再判断map不为0
        if (map != null && map.length > 0) {
            double max = map[0];
            for (int i = 1; i < map.length; i++) {
                if (max < map[i]) {
                    max = map[i];
                }
            }
            return max;//如果满足返回double值
        }else{
            return null;//不满足返回空
        }
    }
}//有个知识点  自动装箱和自动拆箱的问题