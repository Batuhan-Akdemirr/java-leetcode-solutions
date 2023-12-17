import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInAMatrix {
    public static void main(String[] args) {

        int [] [] matrix = {
                {3,7,8},
                {9,11,13},
                {15,16,17}
        };

        LuckyNumbersInAMatrix.luckyNumbers(matrix);
    }

    private static List<Integer> luckyNumbers (int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        ArrayList<Integer> luckNumbers = new ArrayList<>();

        for (int[] ints : matrix) {
            for (int j = 0; j < n; j++) {
                int number = ints[j];
                boolean rowCheck = true;
                boolean colCheck = true;
                for (int k = 0; k < n; k++) {
                    if (ints[k] < number) {
                        rowCheck = false;
                        break;
                    }
                }

                for (int[] value : matrix) {
                    if (value[j] > number) {
                        colCheck = false;
                        break;
                    }
                }

                if (rowCheck && colCheck) {
                    luckNumbers.add(number);
                }

            }
        }

        return  luckNumbers;
    }
}



/*
Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.



Example 1:

Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 2:

Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
Output: [12]
Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 3:

Input: matrix = [[7,8],[1,2]]
Output: [7]
Explanation: 7 is the only lucky number since it is the minimum in its row and the maximum in its column.

 */