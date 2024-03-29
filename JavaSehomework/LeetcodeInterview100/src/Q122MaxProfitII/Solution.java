package Q122MaxProfitII;

/**
 * ClassName: Solution
 * Package: Question122MaxProfitII
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/11/011 上午 11:24
 * @Version 1.0
 */
public class Solution {
    public static int maxProfit(int[] prices) {

        int maxProfit=0;
        for (int i = 1; i < prices.length; i++) {

            if(prices[i]>prices[i-1]){
                maxProfit+=prices[i]-prices[i-1];
            }
        }
        return maxProfit;
    }
}
