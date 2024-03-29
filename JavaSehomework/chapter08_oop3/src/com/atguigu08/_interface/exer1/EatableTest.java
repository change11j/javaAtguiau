package com.atguigu08._interface.exer1;

import javax.tools.ForwardingFileObject;

/**
 * ClassName: EatableTest
 * Package: com.atguigu08._interface.exer1
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/21/021 下午 01:27
 * @Version 1.0
 */
public class EatableTest {
    public static void main(String[] args) {
        Eatable[] eatable=new Eatable[3];
        eatable[0]=new Chinese();
        eatable[1]=new American();
        eatable[2]=new Indian();
        for (int i = 0; i < eatable.length; i++) {
            eatable[i].eat();
        }

    }
}
