package Q45JumpGameII;

/**
 * ClassName: Solution
 * Package: Question45JumpGameII
 * Description:
 *從後往前找 貪婪
 * @Author 張彥瑋
 * @Create 2024/1/12/012 下午 07:36
 * @Version 1.0
 */
public class Solution {
    public static int jump(int[] nums) {
        int n =nums.length;
        int position =n-1;
        int count=0;
        while (position>0){
            for (int i = 0; i < n; i++) {
                if(i+nums[i]>=position){
                    position=i;
                    count++;
                    break;
                }
            }

        }
        return count;
    }
}
