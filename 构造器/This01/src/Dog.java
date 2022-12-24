/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/9 15:42
 */
//class Dog {
//
//    String name;
//    int age;
//
//
////    public Dog(String dName,int dAge){//构造器
////
////        name = dName;
////        age = dAge;
////    }
// public Dog(String name,int age){//构造器
////出现问题，根据变量作用域原则，
//
//     //this.name就是当前对象的属性name
//     //this.age就是当前对象的属性age
//     this.name = name;//构造器name就是局部变量了，而不是属性
//     this.age = age;//构造器age就是局部变量了，而不是属性
//
//}//=======引出this关键字
//    //如果我们构造器的形参，能够直接写成属性名，就更好了
//    public void info(){//成员方法，输出对象的属性
//        System.out.println(name+"\t"+age+"\t");
//    }
//}
