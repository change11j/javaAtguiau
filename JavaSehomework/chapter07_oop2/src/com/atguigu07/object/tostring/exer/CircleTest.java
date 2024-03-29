package com.atguigu07.object.tostring.exer;

/**
 * ClassName: CircleTest
 * Package: com.atguigu07.object.tostring.exer
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/1/001 下午 07:02
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle circle1=new Circle();
        Circle circle2=new Circle();
        System.out.println(circle1.color.equals(circle2.color));
        System.out.println(circle1.equals(circle2));
    }


}
