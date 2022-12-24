/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/17 17:56
 */
class Encap01 {
}

public class Person{
    public String name;
    private int age;
    private double salary;
    private String job;

    public void setAge(int age){
        if(age >= 1 && age <= 120){
            this.age = age;
        }
    }

    public void setName(String name){
        int length = name.length();
        if(length >= 2 && length <= 6){
            this.name = name;
        }
    }
}