/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/9 18:27
 */
class Person {
    String name;
    int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public boolean compareTO(Person p){

//       if(this.name.equals(p.name) && this.age == p.age){
//           return true;
//       }else {
//           return false;}

        //简便写法下方这句
        return this.name.equals(p.name) && this.age == p.age;
    }
}
