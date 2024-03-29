package com.atguigu08.constructor.exer3;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * ClassName: Account
 * Package: com.atguigu08.constructor.exer3
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/1/001 下午 07:44
 * @Version 1.0
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    public Account(int i , double b,double a){
        id = i;
        balance = b;
        annualInterestRate=a;
    }

    public int getId() {
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setId(int i){
        id=i;
    }
    public void setBalance(double b){
        balance=b;
    }
    public void setAnnualInterestRate(double a){
        annualInterestRate=a;
    }
    public void withdraw(double amount){
        if(balance<amount&&amount>0){
            System.out.println("Insufficient Balance");
        }else if(amount>0){
            balance-=amount;
            System.out.println("withdraw : " + amount);
        }
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("deposit : " + amount);
        }
    }
}
