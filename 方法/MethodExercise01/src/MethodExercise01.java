import java.util.Scanner;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/2 19:11
 */
public class MethodExercise01 {
    public static void main(String[] args) {
        //编写类AA新方法，判断一个数是奇数还是偶数，返回boolean
//        AA p1 = new AA();
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("请输入将要判断的数");
//        int n = myScanner.nextInt();
//        boolean b = p1.Judge01(n);
//        if(b){
//            System.out.println("偶数");
//        }else {
//            System.out.println("奇数");
//        }
        AA p1 = new AA();
        p1.printChar(6,5,'x');//line行  row列  x为char符号
    }
}

class AA{
    public boolean Judge01(int x){//判断一个数是奇数还是偶数，返回boolean
//        if((n % 2 == 0) && (n != 0)){
//            System.out.println("偶数");
//            return true;
//        }else if((n % 2 != 0) && (n != 0)){
//            System.out.println("奇数");
//            return false;
//        }else {
//            System.out.println("非奇非偶");
//            return true;
//        }
//      return n % 2 == 0 ? true:false;
        return x % 2 == 0;
    }
    //根据行，列，字符打印对应行数和列数的字符，比如行：4，列：4，字符#，则打印相应的结果
    public void printChar(int line,int row,char x){
        for(int n = 0;n < line;n++){
            for(int i = 0;i < row;i++){
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
