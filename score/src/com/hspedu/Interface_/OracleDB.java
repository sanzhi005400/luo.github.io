package com.hspedu.Interface_;

/**
 * @author: 罗仕杰
 * @date: 2022/11/20 15:49
 * @description:
 */
public class OracleDB implements DBInterface{
    @Override
    public void connect() {
        System.out.println("连接oracle");
    }

    @Override
    public void close() {
        System.out.println("关闭oracle");
    }
}
