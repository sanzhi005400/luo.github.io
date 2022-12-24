/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/1 18:29
 */
public class Abnormal {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "小明";
        p1.age = 20;
        Person p2;
        p2 = p1;
        System.out.println(p2.age);


        p2.age = 200;
        System.out.println(p2.age);
        p2 = null;
        System.out.println(p2.age);
    }
}


class Person {
    int age;
    String name;
}
