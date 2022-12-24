import java.util.Scanner;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/25 17:31
 */
//实现判断一个整数，属于哪个范围：大于0；小于0；等于0；

public class HomeWork02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int number = myScanner.nextInt();
        while(true){
            if(number > 0){
                System.out.println("大于0");
                break;
            }else if(number < 0){
                System.out.println("小于0");
                break;
            }else if(number == 0){
                System.out.println("等于0");
                break;
            }
        }
    }
}
