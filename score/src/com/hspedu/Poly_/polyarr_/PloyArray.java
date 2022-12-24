package com.hspedu.Poly_.polyarr_;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/30 15:35
 */
//多态数组【多态的应用】
    //数组的定义类型为父类类型，里面保存的实际元素类型为子类类型

    //应用实例：现有一个继承结构如下：要求创建一个Person对象，两个Student对象，和2个Teacher对象，统一放在数组中，并调用每个对象say方法

    //应用实例升级：如何调用子类的特有方法，比如Teacher有一个teach，Student有一个study怎么调用？
public class PloyArray {
    public static void main(String[] args) {

        //应用实例：现有一个继承结构如下：要求创建一个Person对象，
        // 两个Student对象，和2个Teacher对象，统一放在数组中，并调用每个对象say方法
        Person person[] = new Person[5];
        person[0] = new Person("jack", 20);
        person[1] = new Student("tom", 30, 100);
        person[2] = new Student("smith", 10, 90);
        person[3] = new Teacher("error", 55, 10000);
        person[4] = new Teacher("jeni", 40, 25000);

        //循环遍历多态数组,调用say方法
        for (int i = 0; i < person.length; i++) {
            //person[i]d 编译类型是Person，它的运行类型是看实际情况
            System.out.println(person[i].say());//有动态绑定机制
            //应用实例升级：如何调用子类的特有方法，比如Teacher有一个teach，Student有一个study怎么调用？
//            person[i].study;
//            person[i].teach;  两个特有方法都调用不了
            if(person[i] instanceof Teacher){//判断person[i]类型是不是Teacher
                System.out.println(((Teacher)person[i]).teach());
                System.out.println("======================");
            }else if(person[i] instanceof Student){//判断person[i]类型是不是Student
                System.out.println(((Student) person[i]).study());
                System.out.println("======================");
            }else if(person[i] instanceof Person){
                System.out.println("======================");
            }else{
                System.out.println("你的类型有误，请检查");
                System.out.println("======================");
            }
        }
//运行结果是
//jack说话年龄是20
//tom说话年龄是30成绩是100.0
//simth说话年龄是10成绩是90.0
//error说话年龄是55工资是10000.0
//jeni说话年龄是40工资是25000.0

//实际运行
//jack说话年龄是20
//tom说话年龄是30成绩是100.0
//smith说话年龄是10成绩是90.0
//error说话年龄是55工资是10000.0
//jeni说话年龄是40工资是25000.0


        //应用实例升级：如何调用子类的特有方法，比如Teacher有一个teach，Student有一个study怎么调用？


    }
}
