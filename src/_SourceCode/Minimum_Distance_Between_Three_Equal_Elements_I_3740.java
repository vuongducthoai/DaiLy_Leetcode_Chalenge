package _SourceCode;

public class Minimum_Distance_Between_Three_Equal_Elements_I_3740 {
    public static int minimumDistance(int[] nums) {
        int n = nums.length;
        if(n <= 2){
            return -1;
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n; i ++){
            for(int j = i + 1; j < n; j ++){
                if(nums[i] == nums[j]){
                    for(int k = j + 1; k < n; k ++){
                        if(nums[j] == nums[k]){
                            ans = Math.min(ans, 2 * ( k - i));
                        }
                    }
                }
            }
        }
        return ans == Integer.MAX_VALUE ? - 1 : ans;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 1, 1, 3};
        System.out.println(minimumDistance(nums));

    }
}
