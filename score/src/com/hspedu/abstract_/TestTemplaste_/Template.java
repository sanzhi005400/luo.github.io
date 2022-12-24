package com.hspedu.abstract_.TestTemplaste_;

/**
 * @author: 罗仕杰
 * @date: 2022/11/20 14:14
 * @description:
 */
abstract class Template {

    public void calculateTime(){
        long start = System.currentTimeMillis();
        code();//动态绑定机制
        long end = System.currentTimeMillis();
        System.out.println("执行时间是"+(end - start));
    }
    public abstract void code();
}
class Sub extends Template{
    @Override
    public void code() {
        int num = 1;
        for (int i = 1; i <= 1000000; i++) {
            num *= i;
        }
    }
}