package com.hspedu.Collection_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: 罗仕杰
 * @date: 2022/12/18 10:20
 * @description:
 *//*集合
 1.可以动态保存多个对象，使用比较方便
 2.提供了一系列方便的擦欧洲哦对象的方法：add。remove。set。get
 3.使用集合添加，删除元素的示意代码，简洁了*/
public class Collection{
    @SuppressWarnings({"all"})
//集合主要是两组（单列集合，双列集合）
// 2.Collection接口有两个重要的子接口 List Set，他们的实现子类都是单列集合
// 3.Map接口的实现子类是双列集合存放K-V
public static void main(String[] args) {
    ArrayList arrayList = new ArrayList();
    arrayList.add("jack");
    arrayList.add("tom");

    HashMap hashMap = new HashMap();
    hashMap.put("Number1","北京");
    hashMap.put("Number2","你爹");
}
}
