/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/5 20:41
 */
public class VarParameterExercise {
    public static void main(String[] args) {
        HspMethod p1 = new HspMethod();
        System.out.println(p1.ShowScore("罗仕杰",60,60,80,90,100));
        System.out.println(p1.ShowScore("吴晓蓉",60,60,100));
    }
}
//有三个方法，分别实现返回名字和两门课程（总分），返回姓名和三门课程（总分），返回名字和五门课程（总分）。
//封装成一个可变参数的方法

class HspMethod{
    public String ShowScore(String name,double... score){
        //接受名字，和课程门数

        double sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        return name + "成绩总分=" + sum;


    }
}