package com.Work_;

/**
 * @author: 罗仕杰
 * @date: 2022/12/2 13:27
 * @description:
 */
public class Clothing extends Goods{//衣服商品类
    private String bound;//衣服品牌
    public Clothing(int num, int quantity, double price) {
        super(num, quantity, price);
        //每创建一个衣服类就要往总件数添加
        Goods.sumPieces += quantity;
    }

    public String getBound() {
        return bound;
    }

    public void setBound(String bound) {
        this.bound = bound;
    }


}
