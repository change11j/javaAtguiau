package com.atguigu04.example.exer4;

/**
 * ClassName: ArrayTool
 * Package: com.atguigu04.example.exer4
 * Description:
 *案例：
 *
 *       根据上一章数组中的常用算法操作，自定义一个操作int[]的工具类。
 *       涉及到的方法有：求最大值、最小值、总和、平均数、遍历数组、复制数组、
 *       数组反转、数组排序(默认从小到大排序)、查找等
 * @Author 張彥瑋
 * @Create 2023/11/16/016 下午 07:45
 * @Version 1.0
 */
public class ArrayTool {
    public int getMax(int[] arr){
        //最大值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    //最小值
    public int getMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    //总和
    public int getSum(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    // 平均数
    public double getAverage(int[] arr){
        double average = getSum(arr)/arr.length;
        return average;
    }

    // 遍历数组
    public void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }

    // 复制数组
    public int[] duplicate(int[] arr){
        int[] d1 = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            d1[i]=arr[i];
        }
        return d1;
    }
    // 数组反转
    public void reverse(int[] arr){
        int temp=0;
        for (int i = 0; i < arr.length/2; i++) {
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }

    // 数组排序(默认从小到大排序)
    public void sort(int[]arr){
        int temp=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
            if(arr[j]>arr[j+1]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            }
        }
    }
    // 查找
    public void search(int[] arr,int num){
        boolean isFlag = true;
        for (int i = 0; i < arr.length; i++) {
            if(num==arr[i]){
                System.out.println("find it,index is"+i);
                isFlag=false;
                break;
            }
        }
        if(isFlag){
            System.out.println("can't find it");
        }


    }
}
