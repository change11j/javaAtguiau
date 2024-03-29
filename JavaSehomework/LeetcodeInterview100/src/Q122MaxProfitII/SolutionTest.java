package Q122MaxProfitII;

/**
 * ClassName: SolutionTest
 * Package: Question122MaxProfitII
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/11/011 上午 11:33
 * @Version 1.0
 */
public class SolutionTest {
    public static void main(String[] args) {
        int[] arr=new int[]{7,1,5,3,6,4};
        int[] arr1=new int[]{1,2,3,4,5};
        int[] arr2=new int[]{7,6,4,3,1};
        Solution.maxProfit(arr);
        System.out.println(Solution.maxProfit(arr));
        Solution.maxProfit(arr1);
        System.out.println(Solution.maxProfit(arr1));
        Solution.maxProfit(arr2);
        System.out.println(Solution.maxProfit(arr2));

    }
}
