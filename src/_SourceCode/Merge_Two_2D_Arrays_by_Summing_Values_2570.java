package _SourceCode;

import java.util.Map;
import java.util.TreeMap;

public class Merge_Two_2D_Arrays_by_Summing_Values_2570 {
    public static int[][] mergeArrays(int[][] nums1, int[][] nums2){
        Map<Integer, Integer> map = new TreeMap<>();
        int l1 = nums1.length;
        int l2 = nums2.length;

        for(int i = 0; i < l1; i ++){
            if(!map.containsKey(nums1[i][0])){
                map.put(nums1[i][0], nums1[i][1]);
            } else {
                map.put(nums1[i][0], (map.get(nums1[i][0]) + nums1[i][1]));
            }
        }

        for(int i = 0; i < l2; i ++){
            if(!map.containsKey(nums2[i][0])){
                map.put(nums2[i][0], nums2[i][1]);
            } else {
                map.put(nums2[i][0], (map.get(nums2[i][0]) + nums2[i][1]));
            }
        }

        int count = 0;
        int[][] ans = new int[map.size()][2];
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            ans[count][0] = entry.getKey();
            ans[count][1] = entry.getValue();
            count++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums1[][] = {{1, 2}, {2, 3}, {4, 5}};
        int nums2[][] = {{1, 4}, {3, 2}, {4, 1}};
        System.out.println(mergeArrays(nums1, nums2));
    }
}
