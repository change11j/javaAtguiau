package com.atguigu01._this.exer2;

/**
 * ClassName: BankTest
 * Package: com.atguigu01._this.exer2
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/5/005 上午 11:24
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.addCustomer("Net","Chang");
        bank.addCustomer("Wei","Chang");

        bank.getCustomer(0).setAccount(new Account(50000));
        bank.getCustomer(0).getAccount().deposit(500);

        System.out.println("Balance : "+bank.getCustomer(0).getAccount().getBalance());
        System.out.println(bank.getNumberOfCustomer());
    }
}
