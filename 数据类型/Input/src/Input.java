import java.util.Scanner;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/18 20:30
 */

public class Input{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("请输入你的名字：");
        String name = myScanner.next();
        System.out.print("请输入你的年龄：");
        int age = myScanner.nextInt();
        System.out.print("请输入你的薪水：");
        double sal = myScanner.nextDouble();
        System.out.println("人的信息如下：");
        System.out.println("名字： " + name + " 年龄： " + age + " 薪水： " + sal);
    }
}