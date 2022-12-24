/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/2 21:20
 */
//B类中编写一个方法test100，可以接受一个数组，在方法中修改该数组，看看原来的数组是否变化
//B类中编写一个方法test200，可以接受一个Person（age，sal）对象，在方法中修改该对象属性，看看原来的对象是否变化

public class MethodParameter02 {
    public static void main(String[] args) {
        B p1 = new B();
//        int[] map = {1,2,3,4,5};
//        p1.test100(map);
//        for(int i =0;i < map.length;i++){
//            System.out.println(map[i]);
//        }

        //测试
        Person p2 = new Person();
        p2.age = 100;
        p2.name = "lsj";
        p2.sal = 2000;


        p1.text200(p2);
        System.out.println(p2.age);
    }
}
class Person{
    String name;
    int age;
    int sal;
}

class B{
    public int[] test100(int[] map){
        for(int i = 0;i < map.length/2;i++){
            int temp = map[map.length -1 -i];
            map[map.length -1 -i] = map[i];
            map[i] = temp;
        }
        return map;
    }

    public  void text200(Person b){
        b.age = 100000;
    }
}