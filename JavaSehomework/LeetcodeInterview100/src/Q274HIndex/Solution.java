package Q274HIndex;

import java.util.Arrays;

/**
 * ClassName: Solution
 * Package: Q274HIndex
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/15/015 下午 12:59
 * @Version 1.0
 */
public class Solution {
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        reverse(citations);
        int n = citations.length;
        int maxPoint=0;
        for (int i = 0; i < n; i++) {
            if (citations[i]-1<i){
                break;
            }
            maxPoint=i+1;
        }
        return maxPoint;
    }
    public static void reverse(int[] arr){
        int n=arr.length;
        for (int i = 0; i < n/2; i++) {
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }

    }
}
