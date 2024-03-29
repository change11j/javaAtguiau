package com.atguigu05.exer.exer1;

/**
 * ClassName: InterfaceTest
 * Package: com.atguigu08._interface.exer2
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/21/021 下午 07:37
 * @Version 1.0
 */
public class InterfaceTest {
    public static void main(String[] args) {
    ComparableCircle circle1=new ComparableCircle(5.0);
    ComparableCircle circle2=new ComparableCircle(6.5);
    try {
        System.out.println(circle1.compareTo(circle2));

    }catch (Exception e){
        e.printStackTrace();
    }

    }
}
