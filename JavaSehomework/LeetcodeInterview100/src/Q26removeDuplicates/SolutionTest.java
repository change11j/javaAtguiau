package Q26removeDuplicates;

import java.util.Arrays;

/**
 * ClassName: SolutionTest
 * Package: Question26removeDuplicates
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/2/002 下午 10:28
 * @Version 1.0
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution =new Solution();
        int[] arr1=new int[]{1,1,2};
        int[] arr2=new int[]{0,0,1,1,1,2,2,3,3,4};
        solution.removeDuplicates(arr1);
        System.out.println(Arrays.toString(arr1));
        solution.removeDuplicates(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
