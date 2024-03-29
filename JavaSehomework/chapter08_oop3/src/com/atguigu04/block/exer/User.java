package com.atguigu04.block.exer;

import java.util.Date;

/**
 * ClassName: User
 * Package: com.atguigu04.block.exer
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/16/016 下午 08:33
 * @Version 1.0
 */
public class User {
    private String userName;
    private String password;
    private long registrationTime;

    public User() {
        System.out.println("registration ");
        registrationTime= System.currentTimeMillis();
        password="123456";
    }

    public long getRegistrationTime() {
        return registrationTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
