import java.util.ArrayList;
import java.util.List;

public class DecompressRunLengthEncodedList {
    public static void main(String[] args) {

        int [] nums = {1,2,3,4};

        DecompressRunLengthEncodedList.decompressRLElist(nums);
    }

    private static int[] decompressRLElist(int[] nums) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];

            for (int j = 0; j < freq; j++) {
                result.add(val);
            }
        }

        int[] decompressedArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            decompressedArray[i] = result.get(i);
        }

        return decompressedArray;
    }
}


/*
We are given a list nums of integers representing a list compressed with run-length encoding.

Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  For each such pair, there are freq elements with value val concatenated in a sublist. Concatenate all the sublists from left to right to generate the decompressed list.

Return the decompressed list.

Example 1:

Input: nums = [1,2,3,4]
Output: [2,4,4,4]
Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
Example 2:

Input: nums = [1,1,2,3]
Output: [1,3,3]
 */