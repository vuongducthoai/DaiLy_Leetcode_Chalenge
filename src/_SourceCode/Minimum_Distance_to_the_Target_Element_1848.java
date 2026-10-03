package _SourceCode;

public class Minimum_Distance_to_the_Target_Element_1848 {
    public static int getMinDistance(int[] nums, int target, int start) {
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] == target){
                ans = Math.min(ans, Math.abs(i - start));
            }
        }
        return ans;
    }

    static void main() {
        int nums[] = {1,2, 3, 4, 5};
        int target = 5, start = 3;
        System.out.println(getMinDistance(nums, target, start));
    }
}
