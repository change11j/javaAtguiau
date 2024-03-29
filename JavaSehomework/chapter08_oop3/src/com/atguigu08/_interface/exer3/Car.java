package com.atguigu08._interface.exer3;

/**
 * ClassName: Car
 * Package: com.atguigu08._interface.exer3
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/26/026 下午 02:10
 * @Version 1.0
 */
public class Car extends Vehicle implements IPower{
    private String carNumber;

    public Car(String brand, String color, String carNumber) {
        super(brand, color);
        this.carNumber = carNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public void power() {
        System.out.println("fuel");

    }

    @Override
    public void run() {
        System.out.println(getCarNumber()+getBrand()+getColor());
        power();
    }
}
