package com.atguigu07.encapsulation.exer1;

/**
 * ClassName: PersonTest
 * Package: com.atguigu07.encapsulation.exer1
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/11/27/027 下午 09:36
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person=new Person();
        person.setAge(56);
        System.out.println(person.getAge());
    }
}
