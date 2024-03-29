package Q27RemoveElement;

/**
 * ClassName: Solution
 * Package: Array.RemoveElement
 * Description:
 *给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 * @Author 張彥瑋
 * @Create 2024/1/1/001 下午 10:50
 * @Version 1.0
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if(nums[j]==val){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    ;
                }
            }
        }
        for(int i = 0;i<nums.length;i++) {
            if (nums[i] == val) {
                count++;
            }
        }
        int newLength=nums.length-count;

        return newLength;
    }
}
