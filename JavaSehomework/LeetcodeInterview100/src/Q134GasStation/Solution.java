package Q134GasStation;

/**
 * ClassName: Solution
 * Package: Q134GasStation
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/23/023 下午 10:02
 * @Version 1.0
 */
public  class Solution {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n= gas.length;
        int fuel=0;
        int count=0;
        int start=0;
        int total=0;
        boolean isflag=false;
        for (int i = 0; i < n; i++) {
            total+=gas[i]-cost[i];
            fuel=gas[i]-cost[i];
            if(fuel>=0&&!isflag){
                start=i;
                count+=gas[start]-cost[start];
                isflag=true;
            }else if (isflag){
                count+=gas[i]-cost[i];
            }
            if(count<0){
                isflag=false;
            }
        }
        if (total>=0){
            return start;
        }else {
            return -1;
        }
    }
}
