package com.atguigu05.method_more._04recursion;

import com.atguigu04.example.exer4.ArrayTool;

import java.util.Arrays;

/**
 * ClassName: QuickSortTest
 * Package: com.atguigu05.method_more._04recursion
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/11/24/024 下午 02:33
 * @Version 1.0
 */
public class QuickSortTest {
    public static void main(String[] args) {
        int[] arr={5,96,83,23,69,77,53,93,56};
        System.out.println(Arrays.toString(arr));
        QuickSort q1=new QuickSort();
        q1.quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
