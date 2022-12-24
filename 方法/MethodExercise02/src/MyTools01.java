/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/4 21:08
 */
class MyTools01{
    //编写方法思路
    //1.方法返回类型 ；Person
    //2.方法名字 ；copyPerson
    //3.方法的形参（）
    //4.方法体；创建一个新对象，并复制属性，返回即可
    public Person copyPerson(Person p){
        //编写一个方法copyPerson,可以复制一个Person对象，返回赋值的对象，克隆对象，注意要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同
        //创建一个新对象
        Person p3 = new Person();
        p3.name = p.name;
        p3.age = p.age;
        return p3;

    }
}
