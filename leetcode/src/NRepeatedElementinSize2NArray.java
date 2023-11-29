import java.util.HashMap;
import java.util.HashSet;

public class NRepeatedElementinSize2NArray {
    public static void main(String[] args) {
        int[] nums = {1,1,1,4,4,4};
        System.out.println( NRepeatedElementinSize2NArray.repeatedNTimes(nums));
    }

    private static int repeatedNTimes(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for(var a : nums){
            if(hashSet.contains(a)) return a;
            else hashSet.add(a);
        }
        return -1;
    }
}


/*
You are given an integer array nums with the following properties:

nums.length == 2 * n.
nums contains n + 1 unique elements.
Exactly one element of nums is repeated n times.
Return the element that is repeated n times.



Example 1:

Input: nums = [1,2,3,3]
Output: 3
Example 2:

Input: nums = [2,1,2,5,3,2]
Output: 2
Example 3:

Input: nums = [5,1,5,2,5,3,5,4]
Output: 5
 */