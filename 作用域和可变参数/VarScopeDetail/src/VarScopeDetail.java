/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/6 20:14
 */

//在同一个作用域中，比如在同一个方法中，两个局部变量，不能重名
//属性生命周期长，伴随着对象的创建而创建，伴随着对象的死亡而死亡，局部变量，生命周期断，伴随着他的代码块的执行而执行，伴随着代码块的结束而死亡，即在一次方法调用过程中
public class VarScopeDetail {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.say();
    }
}


class Person{
    String name = "jack";

    public void say(){
        //属性和局部变量可以重名，访问的时候遵循就近原则
        String name = "king";
        System.out.println("say() name="+name);
    }
}
