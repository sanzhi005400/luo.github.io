import java.util.Scanner;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/5 17:30
 */
public class Salary01 {
    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入员工个数");
        int StallCount = myScanner.nextInt();

        for (int i = 0; i < StallCount; i++) {
            System.out.println("输入"+(i+1)+"个员工的姓名");
            String name = myScanner.next();
            System.out.println("输入"+(i+1)+"个员工的性别");
            char sex = myScanner.next().charAt(0);
            System.out.println("输入"+(i+1)+"个员工的工资");
            double salary = myScanner.nextDouble();
            System.out.println("输入"+(i+1)+"个员工的奖金");
            double bonus = myScanner.nextDouble();
            System.out.println("输入"+(i+1)+"个员工的补贴");
            double subsidt = myScanner.nextDouble();

            double wagesPayable = salary + bonus + subsidt ;
            System.out.println("第"+(i+1)+"个员工"+"应发工资是："+ wagesPayable);//应发工资

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
}
