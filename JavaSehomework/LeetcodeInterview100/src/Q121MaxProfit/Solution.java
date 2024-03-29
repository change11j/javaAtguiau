package Q121MaxProfit;

/**
 * ClassName: Solution
 * Package: Qusetion121MaxProfit
 * Description:
 *超時
 * @Author 張彥瑋
 * @Create 2024/1/10/010 下午 04:07
 * @Version 1.0
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int buy=0;
        int sell=0;
        int profit=0;
        int maxProfit=0;
        int n =prices.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                buy=prices[i];
                sell=prices[j];
                profit=sell-buy;
                if(profit>maxProfit){
                    maxProfit=profit;
                }
            }

            }
        if (maxProfit<=0) {
            return 0;
        }
        return maxProfit;
    }
}
