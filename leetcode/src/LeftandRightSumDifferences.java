public class LeftandRightSumDifferences {
    public static void main(String[] args) {
        int [] array = {10,4,8,3};
        System.out.println(LeftandRightSumDifferences.leftRightDifference(array));
    }

    private static int[] leftRightDifference(int[] nums) {

        int [] array = new int[nums.length];
        int [] leftSummary = new int[nums.length];
        int [] rightSummar = new int[nums.length];
        for(int i=0 ; i< nums.length; i++){
            int rightSummarCount =0;
            for(int j=i+1; j< nums.length; j++){
                rightSummarCount+= nums[j];
            }

            int leftSummarCount = 0;
            for (int k = 0; k < nums.length; k++) {
                leftSummary[k] = leftSummarCount;
                leftSummarCount += nums[k];
            }
            rightSummar[i] = rightSummarCount;
        }

        for(int i=0; i<nums.length;i++){
            array[i] = Math.abs((leftSummary[i] - rightSummar[i]));
        }

        return  array;
    }


}


/*
Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:

answer.length == nums.length.
answer[i] = |leftSum[i] - rightSum[i]|.
Where:

leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
Return the array answer.



Example 1:

Input: nums = [10,4,8,3]
Output: [15,1,11,22]
Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].
Example 2:

Input: nums = [1]
Output: [0]
Explanation: The array leftSum is [0] and the array rightSum is [0].
The array answer is [|0 - 0|] = [0].
* */