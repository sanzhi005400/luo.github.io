/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/9 16:43
 */
class Dog1 {
    public String name;
    public int age;
    public Dog1(String name,int in_age){
        this.name = name;
        this.age = in_age;
    }
    public void info(){
        System.out.println(this.name+"\t"+this.age+"\t"+"当前对象的hashCode是："+this.hashCode());//使用hashcode方法来获取地址
    }
}
