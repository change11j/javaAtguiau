package com.atguigu06.polymorphism.exer3;

/**
 * ClassName: Person
 * Package: com.atguigu06.polymorphism.exer3
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/26/026 下午 12:04
 * @Version 1.0
 */
public class Person {
    protected String name="person";
    protected int age=50;
    public String getInfo() {
        return "Name: "+ name + "\n" +"age: "+ age;
    }
}
