package _SourceCode;

import java.util.Arrays;

public class Find_the_Prefix_Common_Array_of_Two_Arrays_2657 {
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int count[] = new int[n + 1];
        int ans[] = new int[n];
        int common = 0;
        for (int i = 0; i < n; i++) {
            count[A[i]]++;
            if (count[A[i]] == 2) {
                common++;
            }
            count[B[i]]++;
            if (count[B[i]] == 2) {
                common++;
            }
            ans[i] = common;
        }
        return ans;
    }

    public static void main(String[] args) {
        int A[] = {1, 3 ,2 ,4};
        int B[] = {3, 1, 2, 4};
        System.out.println(Arrays.toString(findThePrefixCommonArray(A, B)));
    }
}
