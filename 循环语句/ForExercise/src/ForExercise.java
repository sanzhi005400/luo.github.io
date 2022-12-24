/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/21 20:05
 */
//打印1-100之间所有是9的倍数的整数，统计个数及其总和
import java.util.Scanner;
public class ForExercise {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入开始的数值：");
        int stater = myScanner.nextInt();
        System.out.println("请输入结束的数值：");
        int end = myScanner.nextInt();
        System.out.println("请输入倍数：");
        int Double = myScanner.nextInt();
        int count = 0;
        int amount = 0;
        //int stater = 1;//开始
        //int end = 1100;//结束
        //int Double = 9;//倍数
        for(int i = stater;i <= end ;i++){
            if(i % Double == 0) {
                System.out.println("i=" + i);
                count++;
                amount += i;
            }
        }
        System.out.println("个数是"+count);
        System.out.println("总和是"+amount);
    }
}//如果根据需求要优化范围，那就做成变量