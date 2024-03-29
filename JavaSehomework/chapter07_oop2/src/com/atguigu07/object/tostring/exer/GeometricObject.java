package com.atguigu07.object.tostring.exer;

/**
 * ClassName: GeometricObject
 * Package: com.atguigu07.object.tostring.exer
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/31/031 下午 11:21
 * @Version 1.0
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    protected GeometricObject() {
        color="white";
        weight=1.0;
    }

    protected GeometricObject(String color, double weight) {
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
}
