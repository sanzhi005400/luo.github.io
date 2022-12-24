package com.book.book_;

/**
 * Created by Administrator on 2022/10/22.
 */
public class Test {
    public static void main(String[] args) {
        Books book1 = new Books();
        book1.setBookName("数据库原理");
        book1.setBookIsbn("20221080");
        book1.setPress("北京新华出版社");
        book1.setPrice(50);
        book1.setNumber(100);
        book1.sale(50);

        Books  book2=new  Books("面向对象程序设计","978-7-302-48907-8","清华大学出版社",45.0,200);
        book2.sale(100);
        book2.sale(50);

    }
}
