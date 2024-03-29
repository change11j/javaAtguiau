package Q189Rotate;

/**
 * ClassName: Solution3
 * Package: Question189Rotate
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/7/007 下午 10:09
 * @Version 1.0
 */
public class Solution3 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int hcf=FindHCF(n,k);

        int next=0;
        int index=0;
        int current=nums[index];

        int start=0;
        while (start<hcf){

            next=nums[(index+k)%n];
            nums[(index+k)%n]=current;
            current=next;
            index=(index+k)%n;
            if (start==index){
                index=++start;
                if(index>=n){
                    return;
                }
                current=nums[index];
            }
        }

    }

    public int FindHCF(int a,int b){
        int cf=1;
        int hcf=1;
        while (cf<=a&&cf<=b){
            if(a%cf==0&&b%cf==0){
                hcf=cf;
                cf++;
            }else {
            cf++;

            }
        }
        return hcf;
    }
}
