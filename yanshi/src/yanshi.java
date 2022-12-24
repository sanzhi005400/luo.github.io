import java.util.Scanner;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/8 20:56
 */
public class yanshi {
    public static void main(String[] args) {
//        String name = "罗仕杰";
//        int n = 100;
//        String n2 ="100";
//        int n3 ;
//        char[] arry = {'h','e','l','l','o'};
//        String n1 = "";
//
//        System.out.println(name);
//
//        n1 = String.copyValueOf(arry);
//        System.out.println(n1);
//
//        n3 = Integer.valueOf(n2);
//        System.out.println(n3);
        //调用构造器
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入学生数量");
        int nums = myScanner.nextInt();
        for (int i = 1; i <= nums; i++) {

        }
        System.out.println("年龄");
        int age = myScanner.nextInt();
        System.out.println("姓名");
        String name = myScanner.next();
        System.out.println("性别");
        char sex = myScanner.next().charAt(0);
        System.out.println("成绩");
        float score = myScanner.nextFloat();

        Student student = new Student(age,name,sex,score);
        System.out.println("年龄如下:"+"\n"+student.age);
        System.out.println("名字如下:"+"\n"+student.name);
        System.out.println("性别如下:"+"\n"+student.sex);
        System.out.println("成绩如下:"+"\n"+student.score);


    }
}
class Student{
    int age;
    String name;
    char sex;
    float score;

    public  Student(int Sage,String Sname,char Ssex,float Sscore){
        System.out.println("构造器被调用");
        age = Sage;
        name = Sname;
        sex = Ssex;
        score = Sscore;
    }
}