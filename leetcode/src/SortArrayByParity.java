public class SortArrayByParity {
    public static void main(String[] args) {

        int [] nums = {3,1,2,4};
        SortArrayByParity.sortArrayByParity(nums);
    }

    private static int[] sortArrayByParity(int[] nums) {

        if (nums.length == 1) return nums;

        for(int i=0; i< nums.length-1; i++) {
            for(int j=i; j< nums.length; j++) {
                if(nums[i] % 2 == 1) {
                    int temp = nums[i];
                     nums[i] = nums[j];
                     nums[j] = temp;

                }
            }
        }

        return nums;
    }
}


/*
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.



Example 1:

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
Example 2:

Input: nums = [0]
Output: [0]
 */