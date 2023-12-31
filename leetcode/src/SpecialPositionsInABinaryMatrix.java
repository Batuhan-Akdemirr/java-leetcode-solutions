public class SpecialPositionsInABinaryMatrix {
    public static void main(String[] args) {

        int [] [] mat = {
                {1,0,0},
                {0,1,0},
                {0,0,1},

        };

        System.out.println(SpecialPositionsInABinaryMatrix.numSpecial(mat));

    }

    private static int numSpecial(int[][] mat) {
        int counter = 0;
        int m = mat.length;
        int n = mat[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    boolean rowCheck = true;
                    for (int k = 0; k < n; k++) {
                        if (k != j && mat[i][k] == 1) {
                            rowCheck = false;
                            break;
                        }
                    }
                    boolean colCheck = true;
                    for (int k = 0; k < m; k++) {
                        if (k != i && mat[k][j] == 1) {
                            colCheck = false;
                            break;
                        }
                    }

                    if (rowCheck && colCheck) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }
}

/*
Given an m x n binary matrix mat, return the number of special positions in mat.

A position (i, j) is called special if mat[i][j] == 1 and all other elements in row i and column j are 0 (rows and columns are 0-indexed).



Example 1:


Input: mat = [[1,0,0],[0,0,1],[1,0,0]]
Output: 1
Explanation: (1, 2) is a special position because mat[1][2] == 1 and all other elements in row 1 and column 2 are 0.
Example 2:


Input: mat = [[1,0,0],[0,1,0],[0,0,1]]
Output: 3
Explanation: (0, 0), (1, 1) and (2, 2) are special positions.

 */
