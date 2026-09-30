package _SourceCode;

public  class Range_Sum_Query_Immutable {
    public static class NumArray {
        int nums[];
        public NumArray(int[] nums) {
            this.nums = nums;
        }

        int sum = 0;
        public int sumRange(int left, int right) {
            for(int i = left; i <= right; i++){
                sum+= nums[i];
            }
            return sum;
        }

        public static void main(String[] args) {
            int nums[] = {-2, 0, 3, -5, 2, -1};
            NumArray numArray = new NumArray(nums);
            System.out.println(numArray.sumRange(2, 5));
        }
    }

}
