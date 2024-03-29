package Q274HIndex;

import java.util.concurrent.CountDownLatch;

/**
 * ClassName: SolutionBin
 * Package: Q274HIndex
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/16/016 下午 07:39
 * @Version 1.0
 */
public class SolutionBin {
    public int hIndex(int[] citations) {
        int left=0;
        int right=citations.length;
        int mid=0;
        int cnt=0;
        while (left<right){
            mid=(left+right+1)>>1;
            cnt=0;
            for (int i = 0; i < citations.length; i++) {
                if (citations[i]>=mid){
                    cnt++;
                }
            }
            if (cnt>=mid){
                left=mid;
            }else {
                right=mid-1;
            }

        }
        return left;
    }
}
