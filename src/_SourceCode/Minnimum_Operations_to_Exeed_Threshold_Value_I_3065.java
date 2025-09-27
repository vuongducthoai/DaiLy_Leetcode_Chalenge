package _SourceCode;

public class Minnimum_Operations_to_Exeed_Threshold_Value_I_3065 {
    public static int minOperations(int[] nums, int k) {
        int count = 0;
        for(int num : nums){
            if(num < k){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = {1,1,2,4,9};
        int k = 1;
        System.out.println(minOperations(nums, k));
    }
}
