package com.atguigu06.polymorphism.exer4;

import javax.crypto.interfaces.PBEKey;
import java.net.PortUnreachableException;

/**
 * ClassName: Woman
 * Package: com.atguigu06.polymorphism.exer4
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/29/029 下午 05:50
 * @Version 1.0
 */
public class Woman extends Person{
    @Override
    public void eat() {
        System.out.println("eat elegantly");
    }

    @Override
    public void toilet() {
        System.out.println("sit and pee");
    }
    public void makeup(){
        System.out.println("make up");
    }
}
