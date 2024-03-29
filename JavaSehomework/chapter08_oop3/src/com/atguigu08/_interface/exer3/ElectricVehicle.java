package com.atguigu08._interface.exer3;

import javax.swing.*;

/**
 * ClassName: ElectricVehicle
 * Package: com.atguigu08._interface.exer3
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/26/026 下午 02:03
 * @Version 1.0
 */
public class ElectricVehicle extends Vehicle implements IPower{
    public ElectricVehicle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println(getBrand()+getColor());
        power();
    }


    @Override
    public void power() {
        System.out.println("charge");
    }
}
