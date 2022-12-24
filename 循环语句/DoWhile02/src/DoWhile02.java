/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/24 20:57
 */
//统计1-200能被5整除但不能被3整除的个数
//优化范围的话可以改成键盘输入
import java.util.Scanner;
public class DoWhile02 {
    public static void main(String[] args) {
        System.out.println("计算区间之间能被五整除但不能被三整除的数并统计个数");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入开始值：");
        int star = myScanner.nextInt();
        System.out.println("请输入结束值：");
        int  end = myScanner.nextInt();
        int count = 0;
        do{
            if ((star % 5 == 0) && (star % 3 != 0)){
                count++;
                System.out.println(star);
            }
            star++;
        }while(star <= end);
        System.out.println(count + "个");
    }
}
