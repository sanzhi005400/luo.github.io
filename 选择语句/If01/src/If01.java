/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/19 18:14
 */
import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {
        //编写一个程序，可以输入人的年龄，如果该同志的年龄大于18岁
        //则输出"你的年龄大于18，要对自己的行为负责，送入监狱"
        Scanner myScanner = new Scanner(System.in);
        System.out.print("请输入你的年龄：");
        int age = myScanner.nextInt();
        if (age > 18){
            System.out.println("你年龄大于18，要对自己的行为负责否则送入监狱");
        }
        System.out.println("程序继续执行");
    }
}

