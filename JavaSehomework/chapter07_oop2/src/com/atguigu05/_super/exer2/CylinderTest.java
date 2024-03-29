package com.atguigu05._super.exer2;

/**
 * ClassName: CylinderTest
 * Package: com.atguigu03._extends.exer2
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/15/015 下午 09:11
 * @Version 1.0
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();
        cylinder.setLength(1.4);
        cylinder.setRadius(2.3);
        System.out.println(cylinder.findVolume());
        System.out.println(cylinder.findArea());
    }

}
