package com.atguigu02.singleton.exer1;

/**
 * ClassName: MyRectangle
 * Package: com.atguigu06.polymorphism.exer1
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/24/024 下午 04:17
 * @Version 1.0
 */
public class MyRectangle extends GeometricObject {
    private double width;
    private double height;

    public MyRectangle() {
    }

    public MyRectangle(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double findArea(){
        return width*height;
    }
}
