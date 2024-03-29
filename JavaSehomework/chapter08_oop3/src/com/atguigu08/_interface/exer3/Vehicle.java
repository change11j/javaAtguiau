package com.atguigu08._interface.exer3;

import java.util.SplittableRandom;
import java.util.concurrent.BrokenBarrierException;

/**
 * ClassName: Vehicle
 * Package: com.atguigu08._interface.exer3
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/21/021 下午 09:35
 * @Version 1.0
 */
public abstract class Vehicle {
    private String brand;
    private String color;

    public Vehicle() {
    }

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract void run();
}

