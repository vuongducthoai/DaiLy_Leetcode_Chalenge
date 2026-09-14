package _SourceCode;

public class Flip_Square_Submatrix_Vertucally_3643 {
    public static int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
    /*
        x + i represents the top row index
        x + k - i - 1 represents the bottom row index
        y + j represents the current column
     */
        for(int i = 0; i < k >> 1 ; i ++){
            for(int j = 0; j < k; j++){
                 int temp = grid[x + i][y + j];
                 grid[x + i][y + j] = grid[x + k - 1 - i][y + j];
                 grid[x + k - i - 1][y + j] = temp;
            }
        }
        return grid;
    }

    public static void main(String[] args) {
        int grid[][] = {{3, 4, 2, 3}, {2, 3, 4, 1}};
        int x = 0, y = 2, k = 2;
        System.out.println(reverseSubmatrix(grid, x, y, k));
    }
}
