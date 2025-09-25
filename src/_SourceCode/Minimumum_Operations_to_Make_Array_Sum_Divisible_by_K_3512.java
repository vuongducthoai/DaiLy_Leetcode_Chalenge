package _SourceCode;

public class Minimumum_Operations_to_Make_Array_Sum_Divisible_by_K_3512 {
    public static int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        return sum % k;
    }

    public static void main(String[] args) {
        int nums[] = {3, 2};
        System.out.println(minOperations(nums, 6));
    }
}
