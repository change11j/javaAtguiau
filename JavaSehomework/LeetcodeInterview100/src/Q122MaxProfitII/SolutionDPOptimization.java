package Q122MaxProfitII;

/**
 * ClassName: SolutionDPOptimization
 * Package: Question122MaxProfitII
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/11/011 下午 05:08
 * @Version 1.0
 */
public class SolutionDPOptimization {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int dp0=0;
        int dp1=-prices[0];
        for (int i = 1; i <n ; i++) {
            dp0=Math.max(dp0,dp1+prices[i]);
            dp1=Math.max(dp0-prices[i],dp1);
        }
        return dp0;
    }
}
