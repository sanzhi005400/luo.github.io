package com.hspedu.toString_;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/11/1 19:25
 */
//toString方法
//基本介绍，默返回：全类名+@+哈希值的十六进制【查看Object的toString方法】 （全类名指包名加类名）
// 子类往往重写toString方法，用于返回对象的属性信息 重写toString方法，打印对象或拼接对象时，都会自动调用该对象的toString形式
// 案例演示：Monster【name，job，sal】 当直接输出一个对象时，toString方法会被默认的调用
public class toString_ {
    public static void main(String[] args) {
        Monster monster = new Monster("小妖怪","巡山",2000);
        System.out.println(monster.toString()+"\t"+monster.hashCode());

        System.out.println("当直接输出一个对象时，toString方法会被默认的调用");
        System.out.println(monster);//当直接输出一个对象时，toString方法会被默认的调用
    }
}

class Monster{
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    //重写toString()方法
    //快捷键即可生成

//    @Override
//    public String toString() {//重写后一般是把属性输出，当然程序员也可以自己来设定
//        return "Monster{" +
//                "name='" + name + '\'' +
//                ", job='" + job + '\'' +
//                ", sal=" + sal +
//                '}';
//    }
}