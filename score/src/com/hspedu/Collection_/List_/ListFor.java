package com.hspedu.Collection_.List_;

import java.util.*;

/**
 * @author: 罗仕杰
 * @date: 2022/12/21 16:19
 * @description:
 */
public class ListFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //List 接口的实现子类 Vector LinkedList
        // List arrayList = new ArrayList();
        //List arrayList = new Vector();
        List arrayList = new LinkedList();
        arrayList.add("jack");
        arrayList.add("Love");
        arrayList.add("刘备");
        arrayList.add("北京烤鸭子");
        //1.迭代器
        Iterator list = arrayList.iterator();
        while(list.hasNext()){
            Object obj = list.next();
            System.out.println(obj);
        }
        //2.增强for
        System.out.println("======================");
        for(Object obj:arrayList){
            System.out.println(obj);
        }

        //3。普通for循环
        System.out.println("=======================");
        for(int i = 0;i < arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }
}
