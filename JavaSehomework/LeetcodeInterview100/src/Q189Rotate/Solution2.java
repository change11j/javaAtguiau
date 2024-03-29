package Q189Rotate;

/**
 * ClassName: Solution2
 * Package: Question189Rotate
 * Description:
 *
 * @Author 張彥瑋
 * @Create 2024/1/6/006 下午 02:40
 * @Version 1.0
 */
public class Solution2 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

    }
    public void reverse(int[] arr,int start,int end){
        for (int i = start; i <end; i++,end--) {
            int temp=arr[i];
            arr[i] = arr[end];
            arr[end]=temp;
        }
    }
}
