package com.atguigu07.object.tostring.exer;

/**
 * ClassName: Color
 * Package: com.atguigu07.object.tostring.exer
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/31/031 下午 11:25
 * @Version 1.0
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        color="white";
        weight=1.0;
        radius=1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
        color="white";
        weight=1.0;
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
    public double findArea(){
        return radius*radius*3.14;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
