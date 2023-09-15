import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int [] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(ContainsDuplicate.containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }

        for(Map.Entry<Integer,Integer> set : map.entrySet()){
            if(set.getValue()!=1) return  true;
        }

        return false;
    }
}

/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.


Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 */

