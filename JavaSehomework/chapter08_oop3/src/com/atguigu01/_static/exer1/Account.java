package com.atguigu01._static.exer1;

/**
 * ClassName: Account
 * Package: com.atguigu01._static.exer1
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/10/010 下午 12:51
 * @Version 1.0
 */
public class Account {
    private int id;
    private String password;
    private double balance;
    private static double interest;
    private static double minBalance=1.0;
    private static int init=1001;

    public Account() {
        id=init;
        init++;

    }

    public Account(String password, double balance) {
        this();
        this.password = password;
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterest() {
        return interest;
    }

    public static void setInterest(double interest) {
        Account.interest = interest;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Account.minBalance = minBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
