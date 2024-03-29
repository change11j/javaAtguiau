package com.atguigu08.constructor.exer3;

import java.nio.file.FileStore;

/**
 * ClassName: Customer
 * Package: com.atguigu08.constructor.exer3
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/1/001 下午 07:44
 * @Version 1.0
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;
    public Customer(String f,String l){
        firstName =f;
        lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }
    public void setAccount(Account a){
        account=a;
    }
}
