package com.hspedu.debug_;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/11/1 20:28
 */
//断点调试过程中，是运行状态，是以对象的运行类型来执行的
    //f7跳入方法内
    //f8逐行执行代码
    //shift+f8 跳出方法
    //f9 执行到下一个断点
public class Debug01 {
    public static void main(String[] args) {

        //debug数组
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
            System.out.println("i =" + i);
            System.out.println("sum= " + sum);
        }
        System.out.println("end");
    }
}
