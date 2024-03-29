package Q55CanJump;

/**
 * ClassName: Solution
 * Package: Question55CanJump
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/11/011 下午 09:27
 * @Version 1.0
 */
public class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int k =0;
        for (int i = 0; i <n ; i++) {
            if(i>k){
                return false;
            }
            k=Math.max(k,i+nums[i]);
        }
        return true;
    }

}
