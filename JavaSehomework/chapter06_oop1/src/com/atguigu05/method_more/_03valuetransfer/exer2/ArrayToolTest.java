package com.atguigu05.method_more._03valuetransfer.exer2;

/**
 * ClassName: ArrayToolTest
 * Package: com.atguigu04.example.exer4
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/11/16/016 下午 09:03
 * @Version 1.0
 */
public class ArrayToolTest {
    public static void main(String[] args) {
    int[] arr1 = {9,64,55,48,32,13,87};
    ArrayTool at1 = new ArrayTool();
    double average=at1.getAverage(arr1);
    System.out.println(average);
//    at1.print(arr1);
//    at1.reverse(arr1);
//    at1.print(arr1);
//    at1.sort(arr1);
//    at1.print(arr1);
    at1.search(arr1,64);
    at1.sort(arr1,"desc");
    at1.print(arr1);


    }
}
