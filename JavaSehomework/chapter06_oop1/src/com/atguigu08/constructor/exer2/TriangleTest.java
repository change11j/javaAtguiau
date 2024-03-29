package com.atguigu08.constructor.exer2;

/**
 * ClassName: TriangleTest
 * Package: com.atguigu08.constructor.exer2
 * Description:
 *编写两个类，TriAngle和TriAngleTest，其中TriAngle类中声明私有的底边长base和高height，
 * 同时声明公共方法访问私有变量。此外，提供类必要的构造器。另一个类中使用这些公共方法，计算三角形的面积。
 * @Author 張彥瑋
 * @Create 2023/12/1/001 下午 01:52
 * @Version 1.0
 */
public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setBase(6);
        triangle.setHeight(10);
        int area = triangle.getBase()*triangle.getHeight()/2;
        System.out.println(area);
    }
}
