public class MatrixDiagonalSum {
    public static void main(String[] args) {

        int [] nums1 = {1,1,1,1};
        int [] nums2 = {1,1,1,1};
        int [] nums3 = {1,1,1,1};
        int [] nums4 = {1,1,1,1};

        int [] [] nums = {nums1,nums2,nums3,nums4};
        System.out.println(MatrixDiagonalSum.diagonalSum(nums));
    }

    private static int diagonalSum(int[][] mat) {

        int sum =0;
        for(int i=0;  i< mat.length;  i++){
            sum = sum + mat[i][i] + mat[i][mat.length-i-1];
        }

        if(mat.length % 2 == 1){
            sum = sum - mat[mat.length/2][mat.length/2];
        }

        return  sum;
    }


}

/*
Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.
Example 2:

Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8

Example 3:

Input: mat = [[5]]
Output: 5
 */
