package com.use;

import com.xiaoqiang.Dog;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/15 14:09
 */
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog);//com.xiaoqiang.Dog@16d3586

        com.xiaoming.Dog dog1 = new com.xiaoming.Dog();
        System.out.println(dog1);//com.xiaoming.Dog@154617c
    }
}
