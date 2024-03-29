package com.atguigu07.encapsulation.exer1;

/**
 * ClassName: Person
 * Package: com.atguigu07.encapsulation.exer1
 * Description:
 *创建程序,在其中定义两个类：Person和PersonTest类。定义如下：
 *
 * 用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。
 *
 * 在PersonTest类中实例化Person类的对象b，调用setAge()和getAge()方法，体会Java的封装性。
 * @Author 張彥瑋
 * @Create 2023/11/27/027 下午 05:40
 * @Version 1.0
 */
public class Person {
    private int age;

    public void setAge(int a){
        if (a>=0&&a<=130){
            age=a;
        }else {
            System.out.println("invalid");
        }
    }
    public int getAge(){
        return age;
    }
}
