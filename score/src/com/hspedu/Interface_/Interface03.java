package com.hspedu.Interface_;

/**
 * @author: 罗仕杰
 * @date: 2022/11/20 15:47
 * @description:
 */
public class Interface03 {
    public static void main(String[] args) {
        MysqlDB mysqlDB = new MysqlDB();
        OracleDB oracleDB = new OracleDB();
        T(mysqlDB);
        T(oracleDB);
    }
    public static void T(DBInterface dbInterface){
        dbInterface.connect();
        dbInterface.close();
    }
}
