package com.Work_;

/**
 * @author: 罗仕杰
 * @date: 2022/12/2 13:03
 * @description:
 */
public class Goods {//商品类
    static double sumPrice = 0;//总销售价格
    static int sumPieces = 0;//总销售件数
    private int num;//销售员编号
    private double price;//销售价格
    private int quantity;//销售件数

    public Goods(int num,int quantity,double price) {
        this.num = num;
        this.price = price;
        this.quantity = quantity;
    }


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static double AvgPrice(){
        return sumPrice/sumPieces;
    }

}
