package com.hspedu.InterfacePolyParameter;

/**
 * @author: 罗仕杰
 * @date: 2022/11/20 19:23
 * @description:
 */
/*2)多态数组
* 演示一个案例：给USB数组中，存放Phone和相机对象，Phone类还有一个特有的方法call(),请遍历USB数组，如果是Phone对象，除了调用USB接口定义方法外，还需要调用Phone特有的方法call（）*/
public class InterfacePolyArr {
    public static void main(String[] args) {
        //多态数组 --> 接口类型数组
        USB[] usbs = new USB[2];
        usbs[0] = new Phone();
        usbs[1] = new camera();
        for (int i = 0; i < usbs.length; i++) {
            if(usbs[i] instanceof Phone){
                usbs[i].hi();
                ((Phone) usbs[i]).call();
            } else if (usbs[i] instanceof camera) {
                usbs[i].hi();
            }
        }
    }
}

interface USB{
    void hi();
}
class Phone implements USB{
    @Override
    public void hi() {
        System.out.println("手机调用了hi方法");
    }

    public void call(){
        System.out.println("phone特有的方法");
    }
}
class camera implements USB{
    @Override
    public void hi() {
        System.out.println("相机调用了hi方法");
    }
}