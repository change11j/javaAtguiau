package Q121MaxProfit;

/**
 * ClassName: SolutionDP
 * Package: Qusetion121MaxProfit
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/10/010 下午 05:28
 * @Version 1.0
 */
public class SolutionDP {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }else if (prices[i]-minPrice>maxProfit){
                maxProfit=prices[i]-minPrice;
            }
        }
        return maxProfit;
    }
}
