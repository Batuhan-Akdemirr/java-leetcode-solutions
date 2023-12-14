public class DifferenceBetweenOnesandZerosinRowandColumn {
    public static void main(String[] args) {

        int [] [] grid =  {
                {0,1,1},
                {1,0,1},
                {0,0,1},
        };

        System.out.println(DifferenceBetweenOnesandZerosinRowandColumn.onesMinusZeros(grid));
    }

    private static int[][] onesMinusZeros(int[][] grid) {

        int row = grid.length;
        int col = grid[0].length;

        int[][] diff = new int[row][col];

        int[] r = new int[row];
        int[] c = new int[col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                r[i] += grid[i][j];
                c[j] += grid[i][j];
            }
        }


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                diff[i][j] = 2 * (r[i] + c[j]) - row - col;
            }
        }

        return diff;
    }
}


/*
You are given a 0-indexed m x n binary matrix grid.

A 0-indexed m x n difference matrix diff is created with the following procedure:

Let the number of ones in the ith row be onesRowi.
Let the number of ones in the jth column be onesColj.
Let the number of zeros in the ith row be zerosRowi.
Let the number of zeros in the jth column be zerosColj.
diff[i][j] = onesRowi + onesColj - zerosRowi - zerosColj
Return the difference matrix diff.
 */