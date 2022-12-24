import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/28 20:31
 */
public class SeqSearch {
    public static void main(String[] args) {
        String[] name =  {"白毛狮王","金毛狮王","紫衫龙王","青翼蝠王"};
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入要查找的名字");
        String name1 = myScanner.next();

        int index = -1;
        for(int i = 0;i < name.length;i++){
            if(name1.equals(name[i])){
                System.out.println("恭喜你找到");
                System.out.println("下标为："+i);
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("没找到");
        }

    }
}
