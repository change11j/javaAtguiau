package Q80removeDuplicates;


import java.util.Arrays;

/**
 * ClassName: SolutionTest
 * Package: Question80removeDuplicates
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/4/004 下午 01:35
 * @Version 1.0
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] arr1=new int[]{0,0,1,1,1,1,2,3,3,4,4,4,5,6,6,6,6};
        System.out.println(Arrays.toString(arr1));
        solution.removeDuplicates(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
