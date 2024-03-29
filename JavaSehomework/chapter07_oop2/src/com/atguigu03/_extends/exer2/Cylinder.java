package com.atguigu03._extends.exer2;

/**
 * ClassName: Cylinder
 * Package: com.atguigu03._extends.exer2
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/15/015 下午 09:02
 * @Version 1.0
 */
public class Cylinder extends Circle{
    private double length;

    public Cylinder() {
        this.length = 1;
    }
    public Cylinder(double length){
        this.length=length;

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double findVolume(){
        return findArea()*length;
    }
}
