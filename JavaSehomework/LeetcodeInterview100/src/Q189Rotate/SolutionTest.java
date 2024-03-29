package Q189Rotate;


import java.util.Arrays;

/**
 * ClassName: SolutionTest
 * Package: Question189Rotate
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/6/006 下午 02:49
 * @Version 1.0
 */
public class SolutionTest {
    public static void main(String[] args) {
        int[] arr =new int[]{1,2,3,4,5,6,7};
        int[]arr2=new int[]{-1,-100,3,99};

//        Solution2 solution2=new Solution2();
//        solution2.rotate(arr,3);
//        System.out.println(Arrays.toString(arr));
        int[]arr1=new int[]{1};
//        solution2.rotate(arr1,3);
//        System.out.println(Arrays.toString(arr1));
        Solution3 solution3=new Solution3();
        solution3.rotate(arr,3);
        System.out.println(Arrays.toString(arr));
        solution3.rotate(arr2,2);
        System.out.println(Arrays.toString(arr2));
        solution3.rotate(arr1,2);
        System.out.println(Arrays.toString(arr1));





    }
}
