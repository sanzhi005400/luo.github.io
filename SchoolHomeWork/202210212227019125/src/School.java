/**
 * @author: 罗仕杰
 * @date: 2022/12/12 20:33
 * @description:
 */
abstract class School{
     String Name;
     double Area;
     int Life_history;

    abstract void Study();
}

class University extends School{
    public void Study(){
        System.out.println("I am a university student，I  study  in"+this.Name);}
}

