package com.hspedu.Object_;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/31 18:57
 */
public class jdk {
    public static void main(String[] args) {
        Integer integer = new Integer(5);
    }
}
//  String的equals方法
//把Object的equals重写了
//    public boolean equals(Object anObject) {
//        if (this == anObject) {//如果是同一个对象
//            return true;//返回true
//        }
//        if (anObject instanceof String) {//传进来对象是不是string类型的
//            String anotherString = (String)anObject;//向下转型
//            int n = value.length;
//            if (n == anotherString.value.length) {//如果长度相同
//                char v1[] = value;
//                char v2[] = anotherString.value;
//                int i = 0;
//                while (n-- != 0) {//然后一个一个的比较字符串
//                    if (v1[i] != v2[i])
//                        return false;
//                    i++;
//                }
//                return true;//如果字符串所有字符都相等 ，则返回true
//            }
//        }
//        return false;//如果比较的不是字符串，直接返回false
//    }



//看看object类的equals怎么写的
//即Object的equals方法默认就是判断地址是否相同，或者两个对象是否相同
//public boolean equals(Object obj) {
//    return (this == obj);//两个引用类型用==是判断地址或者对象类型是否相等
//}

//
//     从源码中看出Integer的equals方法重写
//      判断两个值是否相等
//    public boolean equals(Object obj) {
//        if (obj instanceof Integer) {
//            return value == ((Integer)obj).intValue();
//        }
//        return false;
//    }


//   Object的toString方法源码
//    public String toString() {//返回字符串
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());

//    getClass().getName()是全类名（包名加类名）
//    Integer.toHexString(hashCode()) 把哈希整数转换为16进制字符串
//    }