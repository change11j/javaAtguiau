package Q122MaxProfitII;

/**
 * ClassName: SolutionDP
 * Package: Question122MaxProfitII
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/11/011 下午 03:28
 * @Version 1.0
 */
public class SolutionDP {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int [][] dp=new int[n][2];
        for (int i = 1; i < n; i++) {
            dp[i][0]=Math.max(dp[i-1][1]+prices[i],dp[i-1][0]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0])-prices[i];
        }
        return dp[n-1][0];
    }
}
