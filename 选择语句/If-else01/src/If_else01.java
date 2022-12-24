/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/19 22:39
 */
//参加歌手比赛，如果初赛成绩大于8.0进入决赛，否则淘汰，并且根据性别提示进入男子组女子组。输入成绩和性别，进行判断和输出信息

//1.score > 8.0 进入决赛 else淘汰
//2.性别是否男女
import java.util.Scanner;
public class If_else01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        double score = myScanner.nextDouble();
        if (score > 8.0){
            System.out.println("请输入性别");
            char gender = myScanner.next().charAt(0);
            if(gender == '男'){
                System.out.println("进入男子组");
            }else {
                System.out.println("进入女子组");
            }
        }else {
            System.out.println("淘汰");
        }
    }
}
