package com.atguigu05.method_more._03valuetransfer.exer1;

/**
 * ClassName: Circle
 * Package: com.atguigu05.method_more._03valuetransfer.exer1
 * Description:
 *定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面积。
 * @Author 張彥瑋
 * @Create 2023/11/21/021 下午 01:04
 * @Version 1.0
 */
public class Circle {
    double radius;
    public double findArea(){
        return radius*radius*Math.PI;
    }
}
