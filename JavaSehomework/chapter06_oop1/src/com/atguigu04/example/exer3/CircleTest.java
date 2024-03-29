package com.atguigu04.example.exer3;

/**
 * ClassName: CircleTest
 * Package: com.atguigu04.example.exer3
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/11/16/016 下午 07:25
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 =new Circle();
        c1.radius1 = 9;
        double area = c1.area();
        System.out.println(area);
    }
}
