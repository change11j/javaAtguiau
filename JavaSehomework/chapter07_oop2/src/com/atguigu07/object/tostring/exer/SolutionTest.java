package com.atguigu07.object.tostring.exer;

import java.util.Arrays;

/**
 * ClassName: SolutionTest
 * Package: com.atguigu07.object.tostring.exer
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/1/001 下午 09:14
 * @Version 1.0
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] nums1=new int[]{1,2,3,0,0,0};
        int[] nums2=new int[]{2,5,6};
        solution.merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }
}
