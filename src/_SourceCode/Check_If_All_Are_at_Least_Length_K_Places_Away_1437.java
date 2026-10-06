package _SourceCode;

public class Check_If_All_Are_at_Least_Length_K_Places_Away_1437 {
    public boolean kLengthApart(int[] nums, int k) {
       int count = 0;
       int i = 0;
       // All element in arr = 0
       while(nums[i] == 0){
           i++;
           if(i + 1 >= nums.length){
               return true;
           }
       }

       for(int j = i + 1; j < nums.length; j ++){
           if(nums[j] == 0){
               count++;
           } else {
                if(count < k){
                    return false;
                }
                count = 0;
           }
       }
       return true;
    }

    static void main() {
        int nums[] = {1, 0, 0, 0, 1, 0, 0, 1};
        int k = 2;
    }
}
