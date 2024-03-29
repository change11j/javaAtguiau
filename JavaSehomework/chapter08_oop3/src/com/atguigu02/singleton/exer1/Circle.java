package com.atguigu02.singleton.exer1;

/**
 * ClassName: Circle
 * Package: com.atguigu06.polymorphism.exer1
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/24/024 下午 04:11
 * @Version 1.0
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return radius*radius*3.14;
    }
}
