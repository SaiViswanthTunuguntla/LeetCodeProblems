package easy;

import java.util.logging.Logger;

public  class NumMagicSquaresInside {
    public static int numMagicSquaresInside(int[][] grid) {
        int[] row_sum = new int[3];
        int[] col_sum= new int[3];
        int sum=0;
        int colsum=0;
        int digsum=0;
        for (int i = 0; i < 3; i++) {
            
            sum=0;colsum=0;
            for (int j = 0; j < 3 ; j++) {
                sum+=grid[i][j];
                colsum+=grid[j][i];
                if(i==j)digsum+=grid[i][j];
            }
            row_sum[i]=sum;
            col_sum[i]=colsum;

        }
        for (int i = 0; i < 3; i++) {
            System.out.println(row_sum[i]);
            System.out.println(col_sum[i]);
        }
        System.out.println(digsum);

        return 0;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {4,3,8,4},
            {9,5,1,9},
            {2,7,6,2}
        };

        System.out.println(numMagicSquaresInside(grid));
    }
}
