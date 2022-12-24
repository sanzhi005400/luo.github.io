package com.hspedu.InnerClass;

/**
 * @author: 罗仕杰
 * @date: 2022/12/17 21:58
 * @description:
 */
/*1.有一个铃声接口Bell,里面有个ring方法
* 2.有一个手机类Cellphone,具有闹钟功能alarmclock,参数时Bell类型
* 3.测试手机类的闹钟功能，通过匿名内部类(对象)作为参数，打印：懒猪起床了
* 4.在传入另一个匿名内部类(对象)，打印:小伙伴上课了*/
interface Bell{
    void ring();
}
class Cellphone{
    public void alarmclock(Bell bell){
        bell.ring();
    }
}
public class InnerClassExercise02 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }
}
