package Q189Rotate;

/**
 * ClassName: Solution
 * Package: Question189Rotate
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/5/005 下午 01:15
 * @Version 1.0
 */
public class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] temps =new int[n];
        for (int i = 0; i < n; i++) {
            int r=(i+k)%n;
            temps[r]=nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i]=temps[i];
        }
    }
}
