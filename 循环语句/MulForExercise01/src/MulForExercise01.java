/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/25 13:43
 */
//统计3个班成绩情况，每个班有5名同学
//统计各个班的平均分和所有班级的平均分{学生成绩从键盘输入}
//统计三个班及格人数，每个班有5名同学
import java.util.Scanner;
public class MulForExercise01 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);//接收学生成绩
        int count = 0;//计算及格人数
        double SumClass = 0;//三个班级总和分
        for(int i = 1;i <= 3;i++){//i表示班级
            double sum = 0;
            double avg ;
            for(int j = 1;j <= 5; j++){//j表示学生
                System.out.println("请数第"+i+"个班的第"+j+"个学生的成绩");
                double score = myScanner.nextDouble();
                sum += score;
                SumClass += score;
                if(score >= 60){
                    count++;
                }
            }
            avg = sum/5.0;
            System.out.println("第"+i+"个班级的平均分为"+avg);
        }
        System.out.println("三个班及格人数为"+count);
        System.out.println("所有班级平均分是"+(SumClass/15));
    }
}
