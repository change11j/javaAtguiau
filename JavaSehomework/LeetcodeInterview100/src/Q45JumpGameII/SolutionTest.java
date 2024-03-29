package Q45JumpGameII;

/**
 * ClassName: SolutionTest
 * Package: Question45JumpGameII
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/14/014 下午 07:42
 * @Version 1.0
 */
public class SolutionTest {
    public static void main(String[] args) {
    int[] arr=new int[]{2,3,1,1,4};
        System.out.println(Solution.jump(arr));
        Solution2.jump(arr);
        System.out.println(Solution2.jump(arr));

    }
}
