package com.hspedu.HomeWork_;

import com.hspedu.super_.B;

import java.util.Date;

/**
 * @author 罗仕杰
 * @version 2022.08
 * @date 2022/11/3 19:35
 */
//(1)在上面类的基础上扩展新类CheckingAccount对每次存款和取款都收取1美元的手续费
// (2)扩展前一个练习的BankAccount类，新类SavingsAccount每个月都有利息产生
//(earnMonthlylnterest方法被调用)，并且有每月三次免手续费的存款或取款。在earnMonthlylnterest方法中重置交易计数



public class HomeWork08 {
    public static void main(String[] args) {
        CheckingAccount bankAccount = new CheckingAccount(1000);
        bankAccount.deposit(10);
        System.out.println(bankAccount.getBalance());

        bankAccount.withdraw(9);
        System.out.println(bankAccount.getBalance());

        //测试SavingAccount
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());

        savingsAccount.earnMonthlylnterest();
        System.out.println(savingsAccount.getBalance());

    }
}

class BankAccount{//父类
    private double balance;//余额


    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }
    public void deposit(double amount){//存款
        balance += amount;
    }
    public void withdraw(double amount){//取款
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}

class CheckingAccount extends BankAccount{
    //(1)在上面类的基础上扩展新类CheckingAccount对每次存款和取款都收取1美元的手续费


    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {//存款
        super.deposit(amount - 1);
    }

    @Override
    public void withdraw(double amount) {//存款
        super.withdraw(amount + 1);
    }
}

class SavingsAccount extends BankAccount{
    //(2)扩展前一个练习的BankAccount类，新类SavingsAccount每个月都有利息产生
    //(earnMonthlylnterest方法被调用)，并且有每月三次免手续费的存款或取款。在earnMonthlylnterest方法中重置交易计数
    private int count = 3;
    private double rate = 0.01;//利率


    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void deposit(double amount) {
        //判断有没有免手续费的机会
        if(count > 0){super.deposit(amount);}else {
            super.deposit(amount - 1);//把1块钱转入银行账号
        }count--;

    }

    @Override
    public void withdraw(double amount) {
        //判断有没有免手续费的机会
        if(count > 0){super.withdraw(amount);}else {
            super.withdraw(amount + 1);
        }count--;
    }

    public void earnMonthlylnterest(){
        //每个月初我们统计上个月的利息，同时将count = 3
        count = 3;
        super.deposit(getBalance()*rate);
    }
}