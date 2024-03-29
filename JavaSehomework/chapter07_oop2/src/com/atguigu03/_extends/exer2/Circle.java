package com.atguigu03._extends.exer2;

/**
 * ClassName: Circle
 * Package: com.atguigu03._extends.exer2
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/15/015 下午 08:58
 * @Version 1.0
 */
public class Circle {
    private double radius;

    public Circle() {
        radius=1;
    }
    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double findArea(){
        return radius*radius*Math.PI;
    }
}
