package com.hspedu.Interface_;

/**
 * @author: 罗仕杰
 * @date: 2022/11/20 14:34
 * @description:
 */
public class Camera implements UsbInterface{//实现接口本质就是实现方法

    @Override
    public void start() {
        System.out.println("相机开始工作....");
    }

    @Override
    public void stop() {
        System.out.println("相机停止工作....");
    }
}
