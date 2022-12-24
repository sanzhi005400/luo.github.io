/**
 * Created by Administrator on 2022/10/22.
 */
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("罗仕杰");
        student.setAge(20);
        student.setClasses("一班");
        student.setStudentId(20002010);
        student.setScore(90);
        student.PrintInfo();

        System.out.println("=================================================================");

        Teacher teacher = new Teacher();
        teacher.setName("黄老师");
        teacher.setAge(30);
        teacher.setClasses("二班");
        teacher.setTeacherId(50019125);
        teacher.setSalary(5000);
        teacher.PrintInfo();

    }
}