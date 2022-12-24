/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/9 18:27
 */

//定义Person类，里面有name和age属性，提供比较方法，用于判断是否和另一个人相等，输出boolean

public class TestPerson {
    public static void main(String[] args) {
//        Person p1 = new Person("罗仕杰",100);
//        Person p2 = new Person("jack",200);
        //false

        Person p1 = new Person("罗仕杰",100);
        Person p2 = new Person("罗仕杰",100);
        //true


        System.out.println(p1.compareTO(p2));
        System.out.println(p2.compareTO(p1));

    }
}
