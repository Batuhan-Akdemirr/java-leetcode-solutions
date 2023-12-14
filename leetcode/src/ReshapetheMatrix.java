import java.util.ArrayList;

public class ReshapetheMatrix {
    public static void main(String[] args) {

        int [] [] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12},
                {13,14,15},
        };

        ReshapetheMatrix.matrixReshape(mat, 5,3);
    }

    private static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat;
        }

        int[][] returningMatrix = new int[r][c];
        ArrayList<Integer> allNumbers = new ArrayList<>();

        for (int[] ints : mat) {
            for (int anInt : ints) {
                allNumbers.add(anInt);
            }
        }

        int counter = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                returningMatrix[i][j] = allNumbers.get(counter);
                counter++;
            }
        }

        return returningMatrix;
    }
}


/*
In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.

You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.

The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]

Input: mat = [[1,2],[3,4]], r = 2, c = 4
Output: [[1,2],[3,4]]

 */