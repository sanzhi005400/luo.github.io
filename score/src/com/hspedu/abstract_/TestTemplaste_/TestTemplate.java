package com.hspedu.abstract_.TestTemplaste_;

/**
 * @author: 罗仕杰
 * @date: 2022/11/20 13:58
 * @description:
 */
/*
* 1）有多个类，完成不同任务job
* 2）要求统计得到各自完成任务的时间
* 3）请编程完成实现*/
public class TestTemplate {
    public static void main(String[] args) {

        AAA aaa = new AAA();
        aaa.calculateTime();

        BBB bbb = new BBB();
        bbb.calculateTime();

        Sub sub = new Sub();
        sub.calculateTime();
    }
}
