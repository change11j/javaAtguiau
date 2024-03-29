package Q238ProductOfArrayExceptSelf;

/**
 * ClassName: Solution
 * Package: Q238ProductOfArrayExceptSelf
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/22/022 下午 09:43
 * @Version 1.0
 */
public class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int n =nums.length;
        int[] answer =new int[n];
        answer[0]=1;

        int r =1;
        for (int i = 1; i <n ; i++) {
            answer[i]=answer[i-1]*nums[i-1];
        }
        for (int i = n-2; i >=0 ; i--) {
                r*=nums[i+1];
                answer[i]=r*answer[i];


        }
        return answer;
    }
}
