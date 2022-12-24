package com.Work_;

import java.util.Scanner;

/**
 * @author: 罗仕杰
 * @date: 2022/12/1 22:22
 * @description:
 */
public class Discount extends Promotion{//打折类


    private static final double RATE = 0.99;//统一公布的折扣
    public Discount() {
    }

    public static void Discount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入员工编号");
        int num = scanner.nextInt();
        System.out.println("请输入销售件数");
        int quantity = scanner.nextInt();
        System.out.println("请输入销售单价");
        double price = scanner.nextDouble();
        System.out.println("请输入商品类型（衣服..可扩展）");
        String name = scanner.next();
        if(name.equals("衣服")){
            Clothing clothing = new Clothing(num,quantity,price);//如果输入了衣服就创建衣服商品
            if(clothing.getQuantity() >= 10){
                //大于10件打9.8折
                double Price = ((clothing.getQuantity()* clothing.getPrice())*0.98);
                //将打完折的价格存入销售价格
                Goods.sumPrice += Price;
                System.out.println("输入商品成功");
                return;
            }
            //如果没买到10件就不用进判断直接统一打折
            Goods.sumPrice += ((quantity * price) * RATE);

        }
        System.out.println("输入商品成功");
    }
}
