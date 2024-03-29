package Q45JumpGameII;

/**
 * ClassName: Solution2
 * Package: Question45JumpGameII
 * Description:
 *從前往後找 貪婪
 * @Author 張彥瑋
 * @Create 2024/1/14/014 下午 07:54
 * @Version 1.0
 */
public class Solution2 {
    public static int jump(int[] nums) {
        int n = nums.length;

        int preEnd=0;
        int curEnd=0;
        int step=0;
        for (int i = 0; i < n-1; i++) {
            curEnd=Math.max(curEnd,i+nums[i]);
            if(i==preEnd){
                preEnd=curEnd;
                step++;
            }
        }
        return step;
    }
}
