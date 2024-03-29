package com.atguigu05.method_more._01overload.exer;

import java.util.function.DoublePredicate;

/**
 * ClassName: Exer
 * Package: com.atguigu05.method_more._01overload.exer
 * Description:
 *练习2：
 * 编写程序，定义三个重载方法并调用。方法名为mOL。
 * 三个方法分别接收一个int参数、两个int参数、一个字符串参数。
 * 分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
 *
 * 练习3：
 * 定义三个重载方法max()：
 * 第一个方法求两个int值中的最大值，
 * 第二个方法求两个double值中的最大值，
 * 第三个方法求三个double值中的最大值，并分别调用三个方法。
 * @Author 張彥瑋
 * @Create 2023/11/19/019 下午 10:14
 * @Version 1.0
 */
public class Exer {
//    编写程序，定义三个重载方法并调用。方法名为mOL。
//  * 三个方法分别接收一个int参数、两个int参数、一个字符串参数。
//  * 分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
    public void mOL(int num){
        System.out.println(num*num);
    }
    public void mOL(int num1,int num2){
        System.out.println(num1*num2);
    }
    public void mOL(String str){
        System.out.println(str);
    }
//            * 练习3：
//            * 定义三个重载方法max()：
//            * 第一个方法求两个int值中的最大值，
//            * 第二个方法求两个double值中的最大值，
//            * 第三个方法求三个double值中的最大值，并分别调用三个方法。
    public int max(int num1,int num2){
        return (num1>=num2)?num1:num2;

    }
    public double max(double num1,double num2){
        return (num1>=num2)?num1:num2;


    }
    public double max(double num1, double num2, double num3){
        return (max(num1,num2)>=num3)?max(num1,num2):num3;

    }
}
