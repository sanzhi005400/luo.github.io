import java.util.Scanner;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/29 15:51
 */


//类与对象（oop）
//根本原因就是现有的技术不能完美的解决新的需求



public class Object01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入小猫的名字");
        String CatName = myScanner.next();

        String[] cat = {"小白","三岁","白色"};
        String[] cat1 = {"小花","100岁","花色"};

        if(cat[0].equals(CatName)){
            for(int i = 0;i< cat.length;i++){
                System.out.println(cat[i]);
            }
        }else if(cat1[0].equals(CatName)){
            for(int j =0;j < cat1.length;j++){
                System.out.println(cat1[j]);
            }
        }
    }
}
