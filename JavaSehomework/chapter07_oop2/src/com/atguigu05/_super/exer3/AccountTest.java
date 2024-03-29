package com.atguigu05._super.exer3;

/**
 * ClassName: AccountTest
 * Package: com.atguigu05._super.exer3
 * Description:
 *写一个用户程序测试Account类。在用户程序中，创建一个账号为1122、余额为20000、年利率4.5%的Account对象。
 * 使用withdraw方法提款30000元，并打印余额。
 * 再使用withdraw方法提款2500元，使用deposit方法存款3000元，然后打印余额和月利率。
 * @Author 張彥瑋
 * @Create 2023/12/19/019 下午 04:03
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account=new Account(1122,20000,0.045);
        account.withdraw(30000);
        System.out.println(account.getBalance());
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println(account.getBalance());
        System.out.println(account.getAnnualInterestRate());
    }
}
