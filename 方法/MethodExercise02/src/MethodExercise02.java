/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/2 21:55
 */

public class MethodExercise02 {
    public static void main(String[] args) {
//        int[][] Tow = {{1,2,3,4},{2,3,4,5},{5,6,7,8}};
//        MyTools Method = new MyTools();
//        Method.Cheer(Tow);
        Person p1 = new Person();//创建一个Person的对象
        p1.name = "罗仕杰";
        p1.age = 21;

        MyTools01 tools = new MyTools01();//创建一个MyTools01的对象
        Person p2 = tools.copyPerson(p1);
        //到此 p1 和 p2是两个独立的对象，都是person对象，属性相同

        System.out.println("p1的属性"+p1.name+p1.age);
        System.out.println("p2的属性"+p2.name+p2.age);

        //小技巧提示：可以通过 对象比较看看是否是同一个对象
        System.out.println(p1 == p2);

    }
}

class MyTools{//编写一个类MyTools类，编写一个方法可以打印二维数组的数据
    public void Cheer(int[][] map){
        for(int i = 0;i < map.length;i++){
            for(int j = 0;j < map[i].length;j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}

class Person{
    int age;
    String name;
}

