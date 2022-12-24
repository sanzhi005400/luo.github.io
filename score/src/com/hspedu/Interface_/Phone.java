package com.hspedu.Interface_;

/**
 * @author: 罗仕杰
 * @date: 2022/11/20 14:32
 * @description:
 */
public class Phone implements UsbInterface{//Phone这个类需要实现UsbInterface接口的 规定/声明的方法


    @Override
    public void start() {
        System.out.println("手机开始工作....");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作....");
    }
}
