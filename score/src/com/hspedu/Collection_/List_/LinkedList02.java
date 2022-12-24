package com.hspedu.Collection_.List_;

import java.util.LinkedList;

/**
 * @author: 罗仕杰
 * @date: 2022/12/24 15:00
 * @description:
 */
public class LinkedList02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        for (int i = 1; i <= 2; i++) {
            linkedList.add(i);
        }
        linkedList.add(100);
        linkedList.add(100);
        for (Object object:linkedList) {
            System.out.println(object);
        }
    }
}
