package com.atguigu08.constructor.exer3;

/**
 * ClassName: CustomerTest
 * Package: com.atguigu08.constructor.exer3
 * Description:
 *（1）创建一个Customer ，名字叫 Jane Smith, 他有一个账号为1000，余额为2000元，年利率为 1.23％ 的账户。
 * （2）对Jane Smith操作。
 * 存入 100 元，再取出960元。再取出2000元。
 * 打印出Jane Smith 的基本信息：
 *
 * 成功存入 ：100.0
 * 成功取出：960.0
 * 余额不足，取款失败
 * Customer [Smith, Jane] has a account: id is 1000, annualInterestRate is 1.23％, balance is 1140.0
 * @Author 張彥瑋
 * @Create 2023/12/1/001 下午 08:08
 * @Version 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer jS=new Customer("Jane","Smith");
//        Account jSAccount=new Account(1000,2000,1.23/100);
//        jS.setAccount(jSAccount);

        jS.setAccount(new Account(1000,2000,1.23/100));//匿名對象

        jS.getAccount().deposit(100);
        jS.getAccount().withdraw(960);
        jS.getAccount().withdraw(2000);
        System.out.println("Customer ["+ jS.getFirstName()+ ","+ jS.getLastName()+"] " +
                "has a account: id is "+  jS.getAccount().getId()+","+
                "annualInterestRate is "+ jS.getAccount().getAnnualInterestRate()+","+
                "balance is "+ jS.getAccount().getBalance());
    }
}
