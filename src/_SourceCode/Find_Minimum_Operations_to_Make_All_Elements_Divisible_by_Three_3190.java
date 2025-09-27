package _SourceCode;

public class Find_Minimum_Operations_to_Make_All_Elements_Divisible_by_Three_3190 {
    public static int minimumOperations(int[] nums) {
        int operation = 0;
        for(int num : nums){
            if(num % 3 != 0){
                operation++;
            }
        }
        return operation;
    }

    public static void main(String[] args) {
        int nums[] = {3, 6, 9};
        System.out.println(minimumOperations(nums));
    }
}
