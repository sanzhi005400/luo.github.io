/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/21 16:37
 */
//1.使用switch把小写类型的char转换为大写的（键盘输入）。只转换a,b,c,d,e.其他输出other
//3.根据用于指定月份，打印该月份所属的季节。345春季，678夏季，91011秋季，1212冬季【使用穿透】
//import java.util.Scanner;
//public class SwitchExercise01 {
//    public static void main(String[] args) {
//        System.out.println("请输入想转换的字母（a-e）");
//        Scanner myScanner = new Scanner(System.in);
//        char Word = myScanner.next().charAt(0);
//        switch(Word){
//            case 'a':
//                System.out.println("A");break;
//            case 'b':
//                System.out.println("B");break;
//            case 'c':
//                System.out.println("C");break;
//            case 'd':
//                System.out.println("D");break;
//            case 'e':
//                System.out.println("E");break;
//            default:
//                System.out.println("other");break;
//        }
//    }
//}




//2.对学生成绩大于60分的，输出‘合格’。低于60分的，输出‘不合格’。注意输入的成绩不能大于100，提示成绩/60
//import java.util.Scanner;
//public class SwitchExercise01 {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("请输入成绩");
//        double score = myScanner.nextDouble();
//        int ap = (int)(score/60);
//        switch (ap){
//            case 1:
//                System.out.println("合格");break;
//            case 0:
//                System.out.println("不合格");break;
//            default:
//                System.out.println("无匹配");break;
//        }
//    }
//}



//3.根据用于指定月份，打印该月份所属的季节。345春季，678夏季，91011秋季，1212冬季【使用穿透】
import java.util.Scanner;
public class SwitchExercise01 {
    public static void main(String[] args) {
        System.out.println("请输入月份(1-12)");
        Scanner myScanner = new Scanner(System.in);
        int month= myScanner.nextInt();
        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("这是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("这是夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("这是秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("这是冬季");
                break;
            default:
                System.out.println("你输入的月份不对");
        }
    }
}