import java.util.ArrayList;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {

        List<Integer> targetList = new ArrayList<>();
        targetList.add(2);
        targetList.add(7);
        targetList.add(11);
        targetList.add(15);

        System.out.println(TwoSum.twoSum(targetList, 9));
    }

   private static List<Integer> twoSum(List<Integer> nums, int target) {
        List<Integer> index = new ArrayList<>();

        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) == target) {
                    index.add(i);
                    index.add(j);
                }
            }
        }

        return index;
    }



}


/* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.  */


/* Example 1
 Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3

Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:

2 <= nums.length <= 10^4
-10^9 <= nums[i] <= 10^9
-10^9 <= target <= 10^9
Only one valid answer exists.
*/
