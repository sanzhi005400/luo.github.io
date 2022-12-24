package com.hspedu.Exception_;

import java.awt.geom.Area;

/**
 * @author: 罗仕杰
 * @date: 2022/11/28 22:41
 * @description:
 */
/*1） 如果没有出现异常，则执行try块中所有语句，不执行catch块中语句，如果有finally，最后还需要执行finally里面的语句
* 2） 如果出现异常，则try块中异常发生后，剩下的语句不在执行。将执行catch块中的语句。如果finally，最后还需要执行finally里面的语句*/
public class TryCatchExercise01 {
    public static int method(){
        try {
            String[] names = new String[3];
            if(names[1].equals("tom")){
                System.out.println(names[1]);
            }else {
                names[3] = "hspedu";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException A) {
            return 2;
        }catch (NullPointerException n){
            return 3;
        }finally {//finally必须执行
            return 4;//返回4
        }
    }

    public static void main(String[] args){
        System.out.println(method());//4
    }
}
