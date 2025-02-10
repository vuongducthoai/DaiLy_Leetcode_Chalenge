package _SourceCode;

public class Special_Array_I_3151 {
    public static boolean isArraySpecial(int[] nums) {
        if(nums.length == 1) return true;
        if(nums.length == 2) {
            if((nums[0] % 2 == 0 && nums[1] % 2 == 0) || (nums[0] % 2 == 1 && nums[1] % 2 == 1)) {
                return false;
            } else {
                return true;
            }
        }

        for(int i = 1; i < nums.length; i++) {
            if((nums[i] % 2 == 0 && nums[i - 1] % 2 == 0) || (nums[i] % 2 == 1 && nums[i - 1] % 2 == 1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int nums[] = {2, 1, 4};
        System.out.println(isArraySpecial(nums));
    }
}
