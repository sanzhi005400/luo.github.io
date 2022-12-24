import java.util.Objects;
import java.util.Scanner;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/25 16:18
 */
//实现登录验证，有三次机会，如果用户名为“丁真”，密码“666”提示登陆成功，否则提示还有几次机会，请使用for加break完成

public class BreakExercise01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String name ;
        String password ;
        for(int i = 1;i <= 3;i++){
            System.out.println("请输入用户名:");
            name = myScanner.next();
            System.out.println("请输入密码:");
            password = myScanner.next();
            if("丁真".equals(name) && "666".equals(password)){
                System.out.println("登陆成功");
                break;
            }else {
                System.out.println("你还有"+(3-i)+"个机会");
            }
        }
    }
}
