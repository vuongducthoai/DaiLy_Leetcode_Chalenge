package _SourceCode;

public class Compute_Alternating_Sum_3701 {
    public static int alternatingSum(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                ans += nums[i];
            } else {
                ans -= nums[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 7};
        System.out.println(alternatingSum(nums));
    }
}
