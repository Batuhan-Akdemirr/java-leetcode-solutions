public class CountNegativeNumbersinaSortedMatrix {
    public static void main(String[] args) {

    }

    private static int countNegatives(int[][] grid) {

        int columnLength = grid[0].length;
        int counter =0;

        for (int[] ints : grid) {
            for (int j = 0; j < columnLength; j++) {
                if (ints[j] < 0) {
                    counter += ints.length - j;
                    break;
                }
            }
        }

        return  counter;
    }
}

/*
Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

Example 1:

Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
Output: 8
Explanation: There are 8 negatives number in the matrix.
Example 2:

Input: grid = [[3,2],[1,0]]
Output: 0
 */