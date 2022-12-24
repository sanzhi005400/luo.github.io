import java.util.Scanner;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/25 14:39
 */
public class Stars {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        for(int i = 1;i <= 5;i++){
            for(int j = 1;j <= i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
