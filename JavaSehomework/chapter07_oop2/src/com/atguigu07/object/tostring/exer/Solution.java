package com.atguigu07.object.tostring.exer;

import java.util.Arrays;

/**
 * ClassName: Solution
 * Package: com.atguigu07.object.tostring.exer
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/1/001 下午 08:53
 * @Version 1.0
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
    }
}
