package com.atguigu02.singleton.exer1;

/**
 * ClassName: GeometricObject
 * Package: com.atguigu06.polymorphism.exer1
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/24/024 下午 03:28
 * @Version 1.0
 */
public abstract class GeometricObject {
    protected String color;
    protected double weight;

    public GeometricObject() {
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public abstract double findArea();
}
