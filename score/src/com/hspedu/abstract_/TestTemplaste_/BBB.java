package com.hspedu.abstract_.TestTemplaste_;

/**
 * @author: 罗仕杰
 * @date: 2022/11/20 13:59
 * @description:
 */
public class BBB extends Template{

    //从1*..100000
    public void code(){
        //得到开始的时间
//        long start = System.currentTimeMillis();
        int num = 1;
        for (int i = 1; i <= 1000000; i++) {
            num *= i;
        }
        //得到结束的时间
//        long end = System.currentTimeMillis();
//        System.out.println("BBB执行时间是"+(end - start));
    }
}
