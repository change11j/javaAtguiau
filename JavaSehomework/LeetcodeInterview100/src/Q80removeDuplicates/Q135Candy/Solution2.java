package Q80removeDuplicates.Q135Candy;

/**
 * ClassName: Solution2
 * Package: Q135Candy
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/26/026 下午 01:29
 * @Version 1.0
 */
public class Solution2 {
    public int candy(int[] ratings) {
        int n= ratings.length;
        int dec=0;
        int inc=1;
        int pre=1;
        int ret=1;
        for (int i = 1; i < n; i++) {
            if (ratings[i]>=ratings[i-1]){
                dec=0;
                pre= ratings[i]==ratings[i-1]? 1:pre+1;
                inc=pre;
                ret+=pre;
            }else {
                dec++;
                if (inc==dec){
                    dec++;
                }
                ret+=dec;
                pre=1;
            }
        }
        return ret;
    }
}
