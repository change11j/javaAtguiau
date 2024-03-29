package Q27RemoveElement;

import java.util.Arrays;

/**
 * ClassName: SolutionTest
 * Package: Array.RemoveElement
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/2/002 下午 03:56
 * @Version 1.0
 */
public class SolutionTest {
    public static void main(String[] args) {
    int[] arr1=new int[]{3,2,2,3};
    int[] arr2=new int[]{0,1,2,2,3,0,4,2};
    Solution solution=new Solution();
    //solution.removeElement(arr1,3);
        //System.out.println(Arrays.toString(arr1));
        solution.removeElement(arr2,2);
        System.out.println(Arrays.toString(arr2));
        SolutionBeta solutionBeta=new SolutionBeta();
        solutionBeta.removeElement(arr1,3);
        System.out.println(Arrays.toString(arr1));

    }


}
