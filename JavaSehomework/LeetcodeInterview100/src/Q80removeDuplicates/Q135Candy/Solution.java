package Q80removeDuplicates.Q135Candy;

import java.util.Arrays;

/**
 * ClassName: Solution
 * Package: Q135Candy
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/24/024 下午 04:04
 * @Version 1.0
 */
public class Solution {
    public static int candy(int[] ratings) {
        int n= ratings.length;
        int[] candy=new int[n];
        Arrays.fill(candy,1);

        int count=0;
        for (int i = 1; i < n; i++) {

            if (ratings[i]>ratings[i-1]){
                candy[i]=candy[i-1]+1;

            }
        }
        int right=0;
        for (int i = n-1; i >=0; i--) {
            if (i<n-1&&ratings[i] > ratings[i+1]) {
                right++;
            }else {
                right=1;
            }
            count+=Math.max(right,candy[i]);
        }


        return count;
    }
}
