package _SourceCode;

import java.util.Arrays;

public class Row_With_Maximum_Ones_2643 {
    public static int[] rowAndMaximumOnes(int[][] mat) {
        int ans[] = {0, 0};
        int count = 0;
        for(int i = 0; i < mat.length; i ++){
            for(int j = 0; j < mat[0].length; j ++){
                count += mat[i][j];
            }
            if(count > ans[1]){
                ans[0] = i;
                ans[1] = count;
            }
            count = 0;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] mat = {{0, 0}, {1, 1}, {0, 0}};
        System.out.println(Arrays.toString(rowAndMaximumOnes(mat)));
    }
}
