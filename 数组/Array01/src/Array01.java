import java.util.Scanner;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/25 21:42
 */
//求六只鸡的体重总体重和平均体重
public class Array01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入数组大小");
        int n = myScanner.nextInt();
        double[] hens = new double[n];//定义数组的长度

        double totalWeight = 0;//定义了数组的总重量

        for(int j = 0;j< hens.length;j++){
            System.out.println("请输入第"+(j+1)+"个元素的值");
           hens[j] = myScanner.nextDouble();
        }

        //可以遍历数组的所有元素
        for(int i = 0;i< hens.length;i++){
            totalWeight += hens[i];
        }
        System.out.println("总体重="+totalWeight+"平均体重="+totalWeight/ hens.length);
    }
}
