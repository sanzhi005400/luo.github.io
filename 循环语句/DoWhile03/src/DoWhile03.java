import java.util.Scanner;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/25 0:20
 */
public class DoWhile03 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int i = 0;
        do{
            System.out.println("还钱否（y/n）");
            char x = myScanner.next().charAt(0);
            if(x == 'y'){
                break;
            } else {
                System.out.println("五连鞭");
            }
        }while(true);
    }
}
