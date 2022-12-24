package com.hspedu.Interface_;

/**
 * @author: 罗仕杰
 * @date: 2022/11/20 14:29
 * @description:
 */
public class Interface01 {

    public static void main(String[] args) {
        Phone phone = new Phone();
        Camera camera = new Camera();
        Computer computer = new Computer();

        computer.work(phone);
        computer.work(camera);
    }
}
