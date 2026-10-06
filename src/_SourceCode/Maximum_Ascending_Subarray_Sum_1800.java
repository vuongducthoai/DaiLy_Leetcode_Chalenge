package _SourceCode;

public class Maximum_Ascending_Subarray_Sum_1800 {
    public static int maxAscendingSum(int[] nums) {
        int sum = nums[0], ans = nums[0];
        for(int i  = 1; i < nums.length; i ++){
            if(nums[i] <= nums[i - 1]) {
               ans = Math.max(ans, sum);
               sum = nums[i];

            } else {
                sum += nums[i];
            }
        }
        ans = Math.max(ans, sum);
        return ans;
    }

    static void main() {
        int nums[] = {5,5,6,6,6,9,1,2};
        System.out.println(maxAscendingSum(nums));
    }
}
