package _SourceCode;


public class Find_the_Integer_Added_to_Array_I_3131 {
    public static int addedInteger(int[] nums1, int[] nums2) {
      int min1 = Integer.MAX_VALUE;
      int min2 = Integer.MAX_VALUE;
      for(int num : nums1) min1 = Math.min(num, min1);
      for(int num : nums2) min2 = Math.min(num, min2);
      return min2 - min1;
    }

    public static void main(String[] args) {
        int nums1[] = {10};
        int nums2[] = {5};
        System.out.println(addedInteger(nums1, nums2));
    }
}
