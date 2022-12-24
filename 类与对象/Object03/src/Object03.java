/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/9/29 23:11
 */
public class Object03 {
    public static void main(String[] args) {


        Person p1 = new Person();//创建一个对象

        p1.name = "小明";//对象里的name值为"小明"
        p1.age = 10;

        Person p2 = p1;//将p1赋p2；让p2指向p1


        System.out.println(p2.age);
        System.out.println(p2.name);
    }
}


class Person{//创建一个类
    int age;//属性为年龄
    String name;//属性为名字
}
