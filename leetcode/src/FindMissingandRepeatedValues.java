import java.util.HashMap;
import java.util.Hashtable;

public class FindMissingandRepeatedValues {
    public static void main(String[] args) {

        int [] [] grid =  {
                {9,1,7},
                {8,9,2},
                {3,4,6}
        };

        FindMissingandRepeatedValues.findMissingAndRepeatedValues(grid);
    }

    private static int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int length = grid.length;
        int[] arr = new int[2];


        for (int[] ints : grid) {
            for (int anInt : ints) {
                map.merge(anInt, 1, Integer::sum);
            }
        }

        for (int i = 1; i <= length * length; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) > 1) {
                    arr[0] = i;
                }
            } else {
                arr[1] = i;
            }
        }

        return arr;
    }
}



/*
You are given a 0-indexed 2D integer matrix grid of size n * n with values in the range [1, n2]. Each integer appears exactly once except a which appears twice and b which is missing. The task is to find the repeating and missing numbers a and b.

Return a 0-indexed integer array ans of size 2 where ans[0] equals to a and ans[1] equals to b.



Example 1:

Input: grid = [[1,3],[2,2]]
Output: [2,4]
Explanation: Number 2 is repeated and number 4 is missing so the answer is [2,4].
Example 2:

Input: grid = [[9,1,7],[8,9,2],[3,4,6]]
Output: [9,5]
Explanation: Number 9 is repeated and number 5 is missing so the answer is [9,5].
 */