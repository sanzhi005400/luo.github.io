package com.hspedu.abstract_.TestTemplaste_;

/**
 * @author: 罗仕杰
 * @date: 2022/11/20 13:59
 * @description:
 */
public class AAA extends Template{

    //一个计算任务
    //1+..+10000
    public void code(){
//        //得到开始的时间
//        long start = System.currentTimeMillis();
        int num = 0;
        for (int i = 1; i <= 10000000; i++) {
            num += i;
        }
        //得到结束的时间
//        long end = System.currentTimeMillis();
//        System.out.println("AAA执行时间是"+(end - start));
    }
}
