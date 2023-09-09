public class DifferenceBetweenElementSumandDigitSumofanArray {

    public static void main(String[] args) {
        int [] nums = {1,15,6,3};
        System.out.println(DifferenceBetweenElementSumandDigitSumofanArray.differenceOfSum(nums));
    }

    private static int differenceOfSum(int[] nums) {

        int sum=0;
        int sumDigit=0;
        for (int num : nums) {
            sum += num;
            int n = num;
            int x = 0;
            while (n > 0) {
                x += n % 10;
                n /= 10;
            }
            sumDigit += x;
        }
        int total = sum-sumDigit;
        return  Math.abs(total);
    }

}

/*
You are given a positive integer array nums.

The element sum is the sum of all the elements in nums.
The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
Return the absolute difference between the element sum and digit sum of nums.

Note that the absolute difference between two integers x and y is defined as |x - y|.

Example 1:

Input: nums = [1,15,6,3]
Output: 9
Explanation:
The element sum of nums is 1 + 15 + 6 + 3 = 25.
The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
The absolute difference between the element sum and digit sum is |25 - 16| = 9.
Example 2:

Input: nums = [1,2,3,4]
Output: 0
Explanation:
The element sum of nums is 1 + 2 + 3 + 4 = 10.
The digit sum of nums is 1 + 2 + 3 + 4 = 10.
The absolute difference between the element sum and digit sum is |10 - 10| = 0.
 */
