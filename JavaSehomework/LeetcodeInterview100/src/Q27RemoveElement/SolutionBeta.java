package Q27RemoveElement;

/**
 * ClassName: SolutionBeta
 * Package: Array.RemoveElement
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/2/002 下午 05:24
 * @Version 1.0
 */
public class SolutionBeta {
    public int removeElement(int[] nums, int val) {
        int left=0;
        int right= nums.length-1;
        while (left<right){
            if(nums[left]==val){
                nums[left]=nums[right--];

            }else{
            left++;
            }
        }
        return left;
    }
}
