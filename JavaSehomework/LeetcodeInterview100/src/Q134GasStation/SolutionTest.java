package Q134GasStation;



/**
 * ClassName: SolutionTest
 * Package: Q134GasStation
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/23/023 下午 10:22
 * @Version 1.0
 */
public class SolutionTest {
    public static void main(String[] args) {
        int[] gas=new int[]{6,1,4,3,5};
        int[] cost=new int[]{3,8,2,4,2};
        Solution.canCompleteCircuit(gas,cost);
        System.out.println(Solution.canCompleteCircuit(gas, cost));
    }
}
