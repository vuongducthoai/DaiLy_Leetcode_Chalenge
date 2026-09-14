package _SourceCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Next_Greater_Element_I_496 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums2.length; i ++){
            int nextGreater = -1;
            for(int j = i + 1; j < nums2.length; j ++){
                if(nums2[j] > nums2[i]){
                    nextGreater = nums2[j];
                    break;
                }
            }
            map.put(nums2[i],nextGreater);
        }

        for(int i = 0; i < nums1.length; i ++){
            nums1[i] = map.get(nums1[i]);
        }
        return nums1;
    }

    public static void main(String[] args) {
        int nums1[] = {4, 1, 2};
        int nums2[] = {1, 3, 4, 2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
}
