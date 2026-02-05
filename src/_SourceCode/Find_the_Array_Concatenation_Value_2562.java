package _SourceCode;

public class Find_the_Array_Concatenation_Value_2562 {
    public static long findTheArrayConcVal(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        long sum = 0;
        while(l <= r){
            Long number;
            if(l < r){
                String n1  = String.valueOf(nums[l]);
                String n2 = String.valueOf(nums[r]);
                String n = n1 + n2;
                number = Long.valueOf(n);
            } else {
                number = (long)nums[l];
            }
            l++;
            r--;
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        int nums[] = {5,14,13,8,12};
        System.out.println(findTheArrayConcVal(nums));
    }
}
