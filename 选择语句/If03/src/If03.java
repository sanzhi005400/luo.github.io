/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/19 21:11
 */
//输入保国同志的芝麻信用分
//如果
//    1.信用分为100时，输出 信用极好
//     2.信用分为80,99时，输出 信用优秀
//        3.信用分为60,80时，输出 信用分一般
//          4.其他情况，输出信用分不及格
//          5.请从键盘输入保国的芝麻信用分，并加以判断

import java.util.EventListener;
import java.util.Scanner;

public class If03 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入信用分：");
        double score = myScanner.nextDouble();
        if (score >= 1 && score <= 100) {
            if (score == 100) {
                System.out.println("信用极好");
            } else if (score >= 80 && score <= 99) {
                System.out.println("信用优秀");
            } else if (score >= 60 && score < 80) {
                System.out.println("信用一般");
            } else {
                System.out.println("信用分不及格");
            }
        }else {
            System.out.println("信用分需要1-100，请重新输入");
        }
    }
}
