/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/2 18:55
 */
//同一个类中的方法调用可以直接调用。

//跨类中的方法A类调用B类方法；需要通过对象名调用，比如对象名.方法名（参数）


public class MethodDetail02 {
    public static void main(String[] args) {
        A p1 = new A();
        p1.sayOk();
        p1.print(5);
        p1.m1();
    }
}

class A{
    //同一个类中的方法可以直接调用：

    public void print(int n){
        for(int i = 0;i < n;i++){
            System.out.println("我是你爹");
        }
    }

    public void sayOk(){//sayok调用print
        print(10);
    }

//    跨类中的方法A类调用B类方法；需要通过对象名调用

    public void m1(){
        //先创建一个b的对象,然后再调用
        B b = new B();
        b.hi();

    }
}

class B{
    public void hi(){
        System.out.println("b类中的hi方法被执行了" );
    }
}