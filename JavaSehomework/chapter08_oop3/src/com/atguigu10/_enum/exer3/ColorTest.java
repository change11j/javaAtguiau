package com.atguigu10._enum.exer3;

import java.util.concurrent.ForkJoinPool;

/**
 * ClassName: ColorTest
 * Package: com.atguigu10._enum.exer3
 * Description:
 *- 声明final修饰的int类型的属性red,green,blue
 * - 声明final修饰的String类型的属性description
 * - 声明有参构造器Color(int red, int green, int blue,String description)
 * - 创建7个常量对象：红、橙、黄、绿、青、蓝、紫，
 * - 重写toString方法，例如：RED(255,0,0)->红色
 * @Author 張彥瑋
 * @Create 2024/1/29/029 下午 07:21
 * @Version 1.0
 */
public class ColorTest {
    public static void main(String[] args) {
        System.out.println(color.RED);
    }
}
enum color{
    RED(255,0,0,"红"),ORANGE(255,128,0,"橙"),
    YELLOW(255,255,0,"黄"),
    GREEN(0,255,0,"绿"),CYAN(0,255,255,"青"),
    BlUE(0,0,255,"蓝"),PURPLE(128,0,255,"紫");


    private  final int red;
    private final int green;
    private final int blue;
    private final String description;


    color(int red, int green, int blue, String description) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.description = description;
    }

    @Override
    public String toString() {
        return name()+"("+
                red+","+green+","+blue+")->"+description;
    }
}