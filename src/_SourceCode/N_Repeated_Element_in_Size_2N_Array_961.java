package _SourceCode;

import java.util.HashSet;
import java.util.Set;

public class N_Repeated_Element_in_Size_2N_Array_961 {
    public static int repeatedNTimes(int[] nums) {
        Set<Integer> sets = new HashSet<>();
        for(int num : nums){
            if(sets.contains(num)){
                return num;
            }
            sets.add(num);
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {1,2, 3, 3};
        System.out.println(repeatedNTimes(nums));
    }
}
