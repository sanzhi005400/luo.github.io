/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/11/1 21:02
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class SmallChangeSys {
    public static void main(String[] args) {

        boolean load = true;
        boolean load1 = true;
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");

//        2.	完成零钱通明细
//              （1）可以把收益入账和消费，保存到数组
//              （2）可以使用对象
//              （3）简单的话可以使用String拼接


        String details = "--------------零钱通明细---------------";
//        3.完成收益入账  完成功能驱动程序员增加新的代码和变化
//        定义新的变量

//        4.完成消费
//        输入消费的真名,定义变量
        double money = 0;//收益入账
        double balance = 0;//余额
        Date date = null;//时间格式引用
        String name = "";//消费的说明
        String pan = "";

        do{//1.菜单
            System.out.println("--------------零钱通菜单---------------");
            System.out.println("\t"+"\t"+"\t" + "1 零钱通明细");
            System.out.println("\t"+"\t"+"\t" + "2 收益入账");
            System.out.println("\t"+"\t"+"\t" + "3 消费");
            System.out.println("\t"+"\t"+"\t" + "4 退     出");
            System.out.print("请选择（1-4）:");
            int change = scanner.nextInt();

//            if(change == 1){
//                System.out.println("--------------零钱通明细---------------");
//            }else if(change == 2){
//                System.out.println("--------------收益入账---------------");
//            }else if(change == 3){
//                System.out.println("--------------消费---------------");
//            }else if(change == 4){
//                System.out.println("--------------退出---------------");
//                return;
//            }else{
//                System.out.println("请输入1-4的范围内");
//            }
            switch(change){
                case 1:
                    System.out.println(details);
                   break;
                case 2:
                    System.out.println("收益入账：");
                    money = scanner.nextDouble();
                    //money值的范围应该校验

                    balance += money;
                    //拼接收益信息入账到detail1中
                    date = new Date();//获取当前的时间信息
                    details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + "余额："+balance;
                    break;
                case 3:
                    System.out.println("消费金额");
                    System.out.println("请输入消费的说明");
                    name = scanner.next();
                    System.out.println("请输入消费金额");
                    money = scanner.nextDouble();
                    balance -= money;
                    details += "\n"+name+ "\t" + money + "\t" + sdf.format(date) + "\t" + "余额: "+ balance;
                    break;
                case 4:
                    //循环用户的输入直到y或者n为止
                    while(true){
                        System.out.println("你确定要退出吗？y/n");
                        pan = scanner.next();
                        if("y".equals(pan) || "n".equals(pan)){
                            break;
                        }
                    }
                    //当用户退出while以后，进行判断
                    if(pan.equals("y")){
                        load = false;
                    }
                    break;
                default:
                    System.out.println("你的选择有误，请重新选择");

            }
        }while(load);
    }
}
