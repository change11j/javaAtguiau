package com.atguigu05.method_more._04recursion;

import java.util.Arrays;

/**
 * ClassName: QuickSort
 * Package: com.atguigu05.method_more._04recursion
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2023/11/24/024 上午 11:25
 * @Version 1.0
 */
public class QuickSort {
    public void quickSort(int[] arr){
        sort(arr,0,arr.length-1);
    }
    public void sort(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int left=start;
        int right= end;
        int pivot = start;
        while (right!=left){
            while (arr[right]>=arr[pivot]&&right>left){
                right--;
            }
            while (arr[left]<=arr[pivot]&&right>left){
                left++;
            }
            swap(arr,right,left);
        }
        swap(arr,pivot,left);
        sort(arr,start,left-1);
        sort(arr,left+1,end);

    }

    public void swap(int[] arr,int i,int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}



