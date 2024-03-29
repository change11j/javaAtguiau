package Q169majorityElement;

import java.util.Arrays;

/**
 * ClassName: Solution
 * Package: Question169majorityElement
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/4/004 下午 05:48
 * @Version 1.0
 */
public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int slow=0;
        int fast=0;
        int result=0;
        while (fast<nums.length){
            if(nums[slow]!=nums[fast]){
                slow=fast;
                count=0;
            }
            fast++;
            count++;
            if(count>nums.length/2){
                 result=nums[slow];
            }
        }
       return result;
    }
}
