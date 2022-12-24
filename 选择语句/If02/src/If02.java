/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/19 18:36
 */
//双分支结构基本语法
//  if（条件表达式）{
//         执行代码快1；
//}
//else{
    //执行代码块2；
// }



//编写一个程序，可以输入人的年龄，如果该同志的年龄大于18，
// 则输出“你的年龄大于18，要对自己的行为负责，送入监狱”
//否则，输出“你的年龄不大这次放过你了”




import java.util.Scanner;
public class If02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("请输入你的年龄：");
        int age = myScanner.nextInt();
        if(age > 18){
            System.out.println("你的年龄大于18，要对自己的行为负责，送入监狱");
        }
        else{
            System.out.println("你的年龄不大这次放过你了");
        }
    }
}
