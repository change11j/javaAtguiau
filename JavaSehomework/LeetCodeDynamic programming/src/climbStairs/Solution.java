package climbStairs;

/**
 * ClassName: Solution
 * Package: climbStairs
 * Description:
 *遞迴 超時 可用動態規劃優化
 * @Author 張彥瑋
 * @Create 2024/1/10/010 下午 04:48
 * @Version 1.0
 */
public class Solution {
    public int climbStairs(int n) {
        int stair=0;
        if(n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        if(n>2){
            stair=climbStairs(n-2)+climbStairs(n-1);
        }
        return stair;
    }
}
