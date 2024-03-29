package com.atguigu06.polymorphism.exer4;

import java.util.function.ToIntBiFunction;

/**
 * ClassName: Man
 * Package: com.atguigu06.polymorphism.exer4
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/29/029 下午 05:48
 * @Version 1.0
 */
public class Man extends Person{
    @Override
    public void eat() {
        System.out.println("eat meat");
    }

    @Override
    public void toilet() {
        System.out.println("stand and pee");
    }
    public void smoke(){
        System.out.println("smoke");
    }
}
