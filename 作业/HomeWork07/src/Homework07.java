/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/11 19:44
 */
//设计一个Dog类，有名字，颜色，和年龄属性，定义输出方法show（）显示其信息
    //并创建对象，进行测试【提示this.属性】
public class Homework07 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();

        d1.name = "小黄";
        d1.color = "黄色";
        d1.age = 20;

        d2.name = "小白";
        d2.color = "白色";
        d2.age = 30;

        d1.show(d1);
        d2.show(d2);
    }
}


class Dog{
    String name;
    String color;
    int age;

    public void show(Dog p){
        System.out.println("该小狗姓名"+this.name+"该小狗颜色"+this.color+"该小狗年龄"+this.age);
    }

    public void show(String name,String color,int age){
        System.out.println("该小狗姓名"+this.name+"该小狗颜色"+this.color+"该小狗年龄"+this.age);
    }
}