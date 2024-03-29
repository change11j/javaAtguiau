package com.atguigu05._super.exer3;

/**
 * ClassName: Account
 * Package: com.atguigu05._super.exer3
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/18/018 下午 10:26
 * @Version 1.0
 */
public class Account {
    private int id;
    protected double balance;
    private double annualInterestRate;

    public Account() {
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public double getMonthRate(){
        return annualInterestRate/12;
    }
    public void withdraw(int amount){
        if(amount>balance){
            System.out.println("insufficient balance,your balance is :"+balance);
            return;
        }
        balance-=amount;
    }
    public void deposit(int amount){
        if(amount>0){
            balance+=amount;
            System.out.println("your balance is :" +balance);
            System.out.println("annual rate is :"+annualInterestRate);
        }
    }
}
