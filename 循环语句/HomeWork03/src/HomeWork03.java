import java.util.Scanner;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/25 17:38
 */
//判断水仙花数，所谓水仙花数就是只一个三位数，其各个位置上数字立方和等于其本生身
public class HomeWork03 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入原数");
        int n = myScanner.nextInt();

        int n100 = n/100;//百位数提取
        int n10 = n%100/10;//十位数提取
        int n1 = n%100%10;//个位数提取
        int number = (int)(Math.pow(n100,3)+Math.pow(n10,3)+Math.pow(n1,3));


            if(number == n){
                System.out.println("是一个水仙花数");
            }else{
                System.out.println("不是一个水仙花数");
            }

    }
}
