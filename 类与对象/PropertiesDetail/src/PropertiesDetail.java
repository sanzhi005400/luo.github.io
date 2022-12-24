/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/29 22:50
 */
public class PropertiesDetail {
    public static void main(String[] args) {
        //p1是对象名（对象引用）
        //new Person()创建的对象空间（数据）才是真正的对象
        Person p1 = new Person();

        System.out.println("\n当前这个人的信息");
        System.out.println("age=" + p1.age + " name+"+p1.name + " sal=" + p1.sal + " Pass=" + p1.Pass);
        //属性没有赋值的时候，有默认值，规则和数组的一样
        //int 0      short 0    byte 0    long 0     float 0.0
        //double 0.0      char \u0000     boolean false     String null
    }
}

class Person{
    //四个属性
    int age;
    String name;
    double sal;
    boolean Pass;//是否通过考试了
}




//如何创建对象
//1.先声明在创建
//Cat cat;
//cat = new Cat();
//
//2.直接创建
//Cat cat = new Cat();

