package com.atguigu05.method_more._03valuetransfer.exer1;

/**
 * ClassName: CircleTest
 * Package: com.atguigu05.method_more._03valuetransfer.exer1
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/11/21/021 下午 01:08
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius=1;
        System.out.println(circle.findArea());
        PassObject passObject= new PassObject();
        passObject.printAreas(circle,5);
        System.out.println("now radius is :"+circle.radius);
    }
}
