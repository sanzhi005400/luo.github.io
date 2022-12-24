package com.book.book_;

/**
 * Created by Administrator on 2022/10/22.
 */
class Books {//图书类
    private String bookName;//（书名）
    private String bookIsbn;//（图书ISBN号）
    private String press;//（出版社）
    private double price;//（图书价格）
    private int number;//（图书库存数量）
    private static double totalSale;//（销售总额）

//===================================属性======================================================


    public Books() {
    }

    public Books(String bookName, String bookIsbn, String press, double price, int number) {
        this.bookName = bookName;
        this.bookIsbn = bookIsbn;
        this.press = press;
        this.price = price;
        this.number = number;
    }
//===================================构造器======================================================

    public void PrintBooks(){//打印输出
        System.out.println(this.bookName+this.bookIsbn+this.press+this.price+this.number);
    }

    public double sale(int num){
        number -= num;
        totalSale += (num * this.price);
        System.out.println("图书名字"+" "+getBookName()+"库存数量是"+getNumber()+" "+"总销售额是"+totalSale);
        return num * this.price;

    }

    static public void salatota(){

    }

    //=========================================================================================

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}