/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/21 16:21
 */
//1.使用switch把小写类型的char转换为大写的（键盘输入）。只转换a,b,c,d,e.其他输出other
//2.对学生成绩大于60分的，输出‘合格’。低于60分的，输出‘不合格’。注意输入的成绩不能大于100，提示成绩/60
//3.根据用于指定月份，打印该月份所属的季节。345春季，678夏季，91011秋季，1212冬季【使用穿透】
import java.util.Scanner;
public class SwitchExercise {
    public static void main(String[] args) {
        System.out.println("请输入想转换的字母（a-e）");
        Scanner myScanner = new Scanner(System.in);
        int Word = myScanner.nextInt();
        switch(Word-32){
            case 65:
                System.out.println("A");break;
            case 66:
                System.out.println("B");break;
            case  67:
                System.out.println("C");break;
            case 68:
                System.out.println("D");break;
            case 69:
                System.out.println("E");break;
            default:
                System.out.println("other");break;
        }
    }
}
