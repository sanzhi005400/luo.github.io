/**
 * @author: 罗仕杰
 * @date: 2022/12/14 20:36
 * @description:
 */
public class Person{
    private String name;
    private int age;
    private char sex;
    private int ID;

    public Person(){
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public Person(char sex,int ID){
        this.ID = ID;
        this.sex = sex;
    }
    public Person(String name,int age,char sex,int ID){
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public void personEat(){
        System.out.println("人类吃饭");
    }
    public void personGo(){
        System.out.println("人类行走");
    }
}
