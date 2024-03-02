import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {

        int [] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(SquaresOfASortedArray.sortedSquares(nums)));
    }


    private static int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length-1, i = nums.length - 1;
        int[] output = new int[nums.length];
        while(left <= right){
            int value;
            if(nums[left] * nums[left] >= nums[right] * nums[right]){
                value = nums[left] * nums[left++];
            }else{
                value = nums[right] * nums[right--];
            }
            output[i--] = value;
        }
        return output;
    }
}


/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 */