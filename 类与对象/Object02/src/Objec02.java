/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/29 17:03
 */


//使用面向对象解决养猫问题
//
//定义一个猫类的数据类型cat-> 自定义的数据类型

class  Cat {
    //属性
    String name;//名字
    int age;//年龄
    String color;//颜色

    //将来会有个行为
}
//使用（oop）面向对象解决解决
//实例化一只猫【创建一只猫】




public class Objec02 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        //1.new Cat（） 创建一只猫
        //2.Cat cat1 = new Cat（）； 把创建的猫赋值给 cat1
        cat1.name = "小白";
        cat1.age = 28;
        cat1.color = "白色";

        Cat cat2 = new Cat();
        cat2.name = "小花";
        cat2.age = 100;
        cat2.color = "花色";
        //创建了第二只猫

        System.out.println("第一只猫的信息"+" "+cat1.name+" "+cat1.age+" "+cat1.color);
        System.out.println("第一只猫的信息"+" "+cat2.name+" "+cat2.age+" "+cat2.color);
    }
}


//类和对象的区别和联系
//类是抽象的，概念的，代表一类事物，比如人类，猫类，即它是数据类型
//对象是具体的，实际的，代表一个具体事物，即实例
//类是对象的模板，对象是类的一个 个体，对应一个实例



//对象在内存中的存在形式
//
