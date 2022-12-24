package com.hspedu.Interface_;

/**
 * @author: 罗仕杰
 * @date: 2022/11/20 15:48
 * @description:
 */
public class MysqlDB implements DBInterface{
    @Override
    public void connect() {
        System.out.println("连接Mysql");
    }

    @Override
    public void close() {
        System.out.println("关闭Mysql");
    }
}
