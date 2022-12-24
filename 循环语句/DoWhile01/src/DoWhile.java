/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/24 20:50
 */
//打印1-100
//计算1-100的和
public class DoWhile {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        do{
            System.out.println(i);
            sum += i ;
            System.out.println(sum);
            i++;
        }while(i <= 100);

    }
}
