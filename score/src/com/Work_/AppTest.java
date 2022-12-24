package com.Work_;

import java.util.Scanner;

/**
 * @author: 罗仕杰
 * @date: 2022/12/1 22:20
 * @description:
 */
public class AppTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        do{
            System.out.println("请输入要打折的方式(1为返利，2是打折,3查看账单)");
            int key = scanner.nextInt();
            switch (key){
                case 1:
                    System.out.println("请输入商品的总价");
                    double SumPrice = scanner.nextDouble();
                    System.out.println("请输入满减的额度");
                    int FullMoney = scanner.nextInt();
                    System.out.println("请输入返利的额度");
                    int ReturnMoney =  scanner.nextInt();
                    Rebate rebate = new Rebate();//满减促销的类
                    rebate.Rebate();//返利的方法
                    break;
                case 2:
                    Discount.Discount();//打折的方法
                    break;
                case 3:
                    System.out.println("总销售件数"+Goods.sumPieces+"\t总销售额"+Goods.sumPrice+"\t商品的平均售价"+Goods.AvgPrice());
                    break;
            }
            System.out.println("是否退出程序(1为退出，任意键继续)");
            int change = scanner.nextInt();
            if(change == 1){
                loop = false;
            }
        }while (loop);
    }
}
