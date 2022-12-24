import java.util.Scanner;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/5 16:01
 */
//计算指定个数员工的应发工资和实发工资
public class Salary {
    public static void main(String[] args) {
        //输入员工个数
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入员工个数：");
        int Staff = myScanner.nextInt();
        Person person[] = new Person[Staff];//声明一个对象数组，里面有Stall个对象


        for (int i = 0; i < Staff; i++) {
            System.out.println("请输入姓名");
            String name = myScanner.next();
            System.out.println("请输入性别");
            char sex = myScanner.next().charAt(0);
            System.out.println("请输入工资");
            double salary = myScanner.nextDouble();
            System.out.println("请输入奖金");
            double bonus = myScanner.nextDouble();
            System.out.println("请输入补贴");
            double subsidt = myScanner.nextDouble();
            person[i].name = name;
            person[i].sex = sex;
            person[i].salary = salary;
            person[i].bonus = bonus;
            person[i].subsidt = subsidt;
        }
    }
}



class Person{
    String name;
    char sex;
    double salary;
    double bonus;
    double subsidt;

    public void calculation(double salary,double bonus,double subsidt){//计算每个员工应发工资和实发工资
        double wagesPayable = salary + bonus + subsidt;
        System.out.println("应发工资是："+ wagesPayable);//应发工资

        double netSalary;//实发工资
        if(wagesPayable < 3500){
            System.out.println("实发工资是"+wagesPayable);
        }else if(wagesPayable >= 3500 && wagesPayable < 5000){
            wagesPayable = wagesPayable - (wagesPayable-3500)*0.05;
            System.out.println("实发工资是："+wagesPayable);
        }else if((wagesPayable >= 5000) && (wagesPayable <= 7500) ){
            wagesPayable = wagesPayable - ((wagesPayable-5000)*0.075 + (5000 - 3500)*0.05);
            System.out.println("实发工资是："+wagesPayable);
        }else if((wagesPayable >= 7500) && (wagesPayable <= 13000)){
            wagesPayable = wagesPayable -((wagesPayable-7500)*0.12 + ((7500-5000)*0.075 + (5000 - 3500)*0.05));
            System.out.println("实发工资是："+wagesPayable);
        }else if(wagesPayable > 13000){
            wagesPayable = wagesPayable - ((wagesPayable-13000)*0.2 + ((13000-7500)*0.12 + ((7500-5000)*0.075 + (5000 - 3500)*0.05)));
            System.out.println("实发工资是："+wagesPayable);
        }else{
            System.out.println("请输入正确的工资");
        }

    }
}