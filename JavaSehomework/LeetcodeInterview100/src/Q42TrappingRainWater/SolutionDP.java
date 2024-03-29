package Q42TrappingRainWater;

/**
 * ClassName: Solution
 * Package: Q42TrappingRainWater
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/27/027 上午 11:17
 * @Version 1.0
 */
public class SolutionDP {
    public static int trap(int[] height) {
        int n=height.length;
        int[] leftMax=new int[n];
        int[] rightMax=new int[n];
        int ret=0;
        int rain=0;
        leftMax[0]=height[0];
        rightMax[n-1]=height[n-1];
        for (int i = 1; i < n; i++) {
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }
        for (int i = n-2; i >=0;i--) {
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }
        for (int i = 0; i < n; i++) {
            rain=Math.min(leftMax[i],rightMax[i]-height[i]);

                ret+=rain;

        }
        return ret;
    }
}
