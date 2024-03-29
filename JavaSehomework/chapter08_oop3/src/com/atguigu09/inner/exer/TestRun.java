package com.atguigu09.inner.exer;

import org.junit.Test;

import java.util.Scanner;

/**
 * ClassName: TestRun
 * Package: com.atguigu09.inner.exer
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/29/029 上午 09:43
 * @Version 1.0
 */
public class TestRun {
    public static void main(String[] args) {

        new Object(){
            public void test(){
                System.out.println("123");
            }
        }.test();
    }

}

