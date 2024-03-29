package Q26removeDuplicates;

/**
 * ClassName: Solution
 * Package: Question26
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/2/002 下午 10:06
 * @Version 1.0
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0;

        for (int right = 0 ; right < nums.length; right++) {
            if(nums[left]!=nums[right]){
                nums[left+1]=nums[right];
                left++;
            }
        }
        return left+1;
    }
}
