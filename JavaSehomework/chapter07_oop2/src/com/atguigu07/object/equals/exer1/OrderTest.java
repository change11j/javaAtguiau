package com.atguigu07.object.equals.exer1;

/**
 * ClassName: OrderTest
 * Package: com.atguigu07.object.equals.exer1
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/12/31/031 下午 10:34
 * @Version 1.0
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order1=new Order(13332,"chang");
        Order order2=new Order(13332,"chang");
        System.out.println(order1.equals(order2));
    }
}
