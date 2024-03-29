package Q80removeDuplicates;

/**
 * ClassName: Solution
 * Package: Question80removeDuplicates
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/3/003 下午 01:07
 * @Version 1.0
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int slow = 2;
        int fast = 2;
        while (fast < nums.length) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
