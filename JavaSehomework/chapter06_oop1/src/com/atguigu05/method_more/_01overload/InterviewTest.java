package com.atguigu05.method_more._01overload;

//面试题
public class InterviewTest {
	public static void main(String[] args) {
		
		int[] arr = new int[]{1,2,3};
		System.out.println(arr);//地址
		
		char[] arr1 = new char[]{'a','b','c'};
		System.out.println(arr1);//地址 錯 遍歷
		
		boolean[] arr2 = new boolean[]{false,true,true};
		System.out.println(arr2);//地址
		
	}
}
