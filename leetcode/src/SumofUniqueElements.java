import java.util.HashMap;
import java.util.Map;

public class SumofUniqueElements {
    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5};
        System.out.println(SumofUniqueElements.sumOfUnique(nums));

    }

    private static int sumOfUnique(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        int sum =0;

        for (int num : nums) {
            map.merge(num, 1, Integer::sum);

        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) sum = sum+ entry.getKey();
        }

        return  sum;
    }


}

/*
You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.

Example 1:

Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.
Example 2:

Input: nums = [1,1,1,1,1]
Output: 0
Explanation: There are no unique elements, and the sum is 0.
Example 3:

Input: nums = [1,2,3,4,5]
Output: 15
Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.
 */
