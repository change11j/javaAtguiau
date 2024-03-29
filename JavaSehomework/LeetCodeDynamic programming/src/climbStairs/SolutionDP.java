package climbStairs;

/**
 * ClassName: SolutionDP
 * Package: climbStairs
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/10/010 下午 05:15
 * @Version 1.0
 */
public class SolutionDP {
    public int climbStairs(int n) {
        int p=0;
        int q=0;
        int r=1;
        for (int i = 1; i <=n; i++) {
            p=q;
            q=r;
            r=p+q;
        }
        return r;
    }
}
