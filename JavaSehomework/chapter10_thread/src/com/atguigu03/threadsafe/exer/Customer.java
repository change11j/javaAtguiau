package com.atguigu03.threadsafe.exer;

/**
 * ClassName: Account
 * Package: com.atguigu03.threadsafe.exer
 * Description:
 * 银行有一个账户。
 *
 * 有两个储户分别向同一个账户存3000元，每次存1000，存3次。每次存完打印账户余额。
 * 问题：该程序是否有安全问题，如果有，如何解决？
 *
 * @Author 張彥瑋
 * @Create 2024/3/29 3:34 PM
 * @Version 1.0
 */
public class Customer extends Thread {
    Account account;
    public Customer(Account account){
        this.account=account;
    }
    public Customer(Account account,String name){
        super(name);
        this.account = account;

    }


    @Override
    public void run() {

        for (int i = 0; i < 3; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            account.deposit(1000);
        }
    }
}
class Account {
    private double balance;

    public synchronized void deposit(double amt){

                balance+=amt;
                System.out.println(Thread.currentThread().getName()+"存入"
                        +amt+"餘額為："+balance);


    }

}


class Main{
    public static void main(String[] args) {
        Account a = new Account();
        Customer c1=new Customer(a,"c1");
        Customer c2=new Customer(a,"c2");

        c1.start();
        c2.start();


    }
}
