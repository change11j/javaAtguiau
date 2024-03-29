package Q274HIndex;

/**
 * ClassName: SolutionCount
 * Package: Q274HIndex
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/16/016 下午 04:30
 * @Version 1.0
 */
public class SolutionCount {
    public int hIndex(int[] citations) {
        int n =citations.length;
        int[] count =new int[n+1];
        int tot=0;
        for (int i = 0; i < n; i++) {
            if (citations[i]>=n){
                count[n]++;
            }else{
                count[citations[i]]++;
            }
        }
        for (int i = n; i >=0 ; i--) {
            tot+=count[i];
            if (tot>=i){
                return i;
            }
        }
        return 0;
    }
}
