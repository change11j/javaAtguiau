package com.atguigu08._interface.exer3;

/**
 * ClassName: Bicycle
 * Package: com.atguigu08._interface.exer3
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/26/026 下午 02:00
 * @Version 1.0
 */
public class Bicycle extends Vehicle {
    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println( getBrand()+getColor());
    }
}
