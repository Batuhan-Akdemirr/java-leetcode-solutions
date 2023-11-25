import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {

        int [] solutionArray = {4,1,2,1,2,4,6,6,11};
        System.out.println(SingleNumber.singleNumber(solutionArray));
    }

    private  static  int singleNumber(int[] nums){
        Arrays.sort(nums);

        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 0; i < nums.length; i = i + 2) {
            if (i == nums.length - 1) {
                return nums[i];
            }
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        return 0;
    }
}


/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
 */