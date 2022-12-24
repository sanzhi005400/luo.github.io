package SmallChangeSysOOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/11/2 17:59
 */
public class SmallChangeSysOOP {
        //1.	先完成显示菜单，并可以选择
    boolean load = true;
    boolean load1 = true;
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
    String details = "--------------零钱通明细---------------";


    private double money = 0;//收益入账
    private double balance = 0;//余额
    private String name = "";//消费的说明
    private String pan = "";//
    Date date = null;//时间格式引用

    public void MainMenu(){
        do{//1.菜单
            System.out.println("--------------零钱通菜单---------------");
            System.out.println("\t\t1. 零钱通明细\n\t\t2. 收益入账\n\t\t3. 消费\n\t\t4. 退\t\t\t出");
            System.out.println("请选择（1-4）：");
            int change = scanner.nextInt();
            switch(change){
                case 1:
                    Detail();
                    break;
                case 2:
                    Income();
                    break;
                case 3:
                    send();
                    break;
                case 4:
                    exit();
                    break;
                default:
                    System.out.println("你的选择有误，请重新选择");
            }
        }while(load);

    }


    //显示明细功能实现方法
    public void Detail(){
        System.out.println(details);
    }


    //收益入账功能实现方法
    public void Income(){
        System.out.println("收益入账：");
        double money = scanner.nextDouble();
        //money值的范围应该校验
        if(money <= 0){
            System.out.println("收益不能小于0");
            return;
        }
        if(money > 20000){
            System.out.println("单笔金额不能大于20000");
        }
        balance += money;
        //拼接收益信息入账到detail1中
        date = new Date();//获取当前的时间信息
        details +="\n收益入账\t" + this.money + "\t" + sdf.format(date) + "\t" + "余额："+balance;
    }


    //消费功能实现方法
    public void send(){
        System.out.println("消费金额");
        System.out.println("请输入消费的说明");
        name = scanner.next();
        System.out.println("请输入消费金额");
        money = scanner.nextDouble();
        if(money < 0){
            System.out.println("消费金额不能小于0");
            return;
        }
        if(money > 0 || money < this.money){
            System.out.println("你的消费金额应该在0-"+this.money);
            return;
        }
        balance -= money;
        details += "\n"+name+ "\t" + money + "\t" + sdf.format(date) + "\t" + "余额: "+ balance;
    }

    //退出实现方法
    public void exit(){
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
    }

}
