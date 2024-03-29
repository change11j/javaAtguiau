package com.atguigu05.method_more._01overload.exer;

/**
 * ClassName: ExerTest
 * Package: com.atguigu05.method_more._01overload.exer
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/11/19/019 下午 10:54
 * @Version 1.0
 */
public class ExerTest {
    public static void main(String[] args) {
       Exer e1 = new Exer();
       e1.mOL(2);
       e1.mOL(3,3);
       e1.mOL("5");

        System.out.println(e1.max(3,6));
        System.out.println(e1.max(6.5,9.9,1));


    }

}
