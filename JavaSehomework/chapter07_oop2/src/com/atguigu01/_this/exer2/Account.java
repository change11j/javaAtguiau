package com.atguigu01._this.exer2;

/**
 * ClassName: Account
 * Package: com.atguigu01._this.exer2
 * Description:
 *1、按照UML类图，创建Account类，提供必要的结构。
 * - 在提款方法withdraw()中，需要判断用户余额是否能够满足提款数额的要求，如果不能，应给出提示。
 * - deposit()方法表示存款。
 * @Author 張彥瑋
 * @Create 2023/12/4/004 下午 01:28
 * @Version 1.0
 */
public class Account {
    private double balance;

    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amt){
        if(amt>0){
        balance+=amt;
        System.out.println("deposit successfully");
        }
    }
    public void withdraw(double amt){
        if(amt>0&&balance>=amt){
            balance-=amt;
        }else {
            System.out.println("insufficient balance");
        }
    }
}
