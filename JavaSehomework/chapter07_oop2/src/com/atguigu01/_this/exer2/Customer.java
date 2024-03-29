package com.atguigu01._this.exer2;

/**
 * ClassName: Customer
 * Package: com.atguigu01._this.exer2
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/4/004 下午 01:36
 * @Version 1.0
 */
public class Customer {
    private String fistName;
    private String lastName;
    private Account account;

    public Customer(String f, String l) {
        this.fistName = f;
        this.lastName = l;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account acct) {
        this.account = acct;
    }
}
