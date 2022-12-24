package com.hspedu.encap;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/10/17 19:14
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("jackdd");
        account.setBalance(2);
        account.setPassword("Lo");
        System.out.println(account.info());

    }
}
//=========================================主程序====================================

class Account{
    private String name;
    private int balance;
    private String password;
    //=============================属性================================================
    public String getName() {
        return name;
    }

    public void setName(String name) {
        int len = name.length();
        if (len >= 2 && len <= 4){
            this.name = name;
        }else {
            System.out.println("名字需要在四位数以内");
            this.name = "无名";
        }
    }
    //====================================姓名=========================================
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance >= 20){
            this.balance = balance;
        }else {
            System.out.println("余额不能小于20");
            this.balance = 20;
        }
    }
    //======================================余额=======================================
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        int len = password.length();
        if (len == 6){
            this.password = password;
        }else {
            System.out.println("密码必须为六位数");
            this.name = "*******";
        }
    }
    //=========================================密码====================================

    public String info(){
        //可以增加一个权限的校验
        //判断身份是否合法
        return "用户信息"+"姓名"+name+"余额"+balance;
    }
    //=========================================输出语句====================================
}


