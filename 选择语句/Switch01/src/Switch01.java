/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/20 19:35
 */
//该程序可以接收一个字符abcdefg
//a表示星期一，b表示星期二。。。。
//根据用户的输入现实相依的信息，要求使用switch语句

import java.util.Scanner;
public class Switch01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个字符 a-g");
        char day = myScanner.next().charAt(0);
        switch (day){
            case 'a':
                System.out.println("星期一");
                break;
            case 'b':
                System.out.println("星期二");
                break;
            case 'c':
                System.out.println("星期三");
                break;
            case 'd':
                System.out.println("星期四");
                break;
            case 'e':
                System.out.println("星期五");
                break;
            case 'f':
                System.out.println("星期六");
                break;
            case 'g':
                System.out.println("星期日");
                break;
            default:
                System.out.println("你输入的字符不正确");
                break;
        }
    }
}
