package com.atguigu06.polymorphism.exer3;

/**
 * ClassName: Graduate
 * Package: com.atguigu06.polymorphism.exer3
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/26/026 下午 12:05
 * @Version 1.0
 */
public class Graduate extends Student{
    public String major="IT";
    public String getInfo()
    {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school+"\nmajor:"+major;
    }
}
