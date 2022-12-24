/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/25 17:06
 */
//编程实现如下功能
//某人又100000元，每经过一次路口需要缴费，规则如下
//1.现金大于50000时，每次交百分之五
//2.当现金小于50000时，每次交1000
//编程计算该人可以经过多少次路口，要求，使用while break完成



public class HomeWork01 {
    public static void main(String[] args) {
        double person = 100000;//初始钱
        int count = 0;
        while (true) {
            if(person > 50000){
                person = person * 0.95;
                count++;
            }else if(person >= 1000){
                person = (person - 1000);
                count++;
            }else{
                break;
            }
        }
        System.out.println("这么多钱可以过"+count+"个路口");
    }
}
