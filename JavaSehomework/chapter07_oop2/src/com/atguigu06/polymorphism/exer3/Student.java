package com.atguigu06.polymorphism.exer3;

/**
 * ClassName: Student
 * Package: com.atguigu06.polymorphism.exer3
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/26/026 下午 12:04
 * @Version 1.0
 */
public class Student extends Person{
    protected String school="pku";
    public String getInfo() {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school;
    }
}
