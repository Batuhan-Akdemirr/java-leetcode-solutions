import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionofTwoArrays2 {
    public static void main(String[] args) {
        int [] nums1 = {4,7,9,7,6,7};
        int [] nums2 = {5,0,0,6,1,6,2,2,4};
        System.out.println(IntersectionofTwoArrays2.intersect(nums1,nums2));
    }
    private static int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer,Integer> nums1Map = new HashMap<>();
        Map<Integer,Integer> nums2Map = new HashMap<>();
        for (int num : nums1) {
            nums1Map.merge(num, 1, Integer::sum);
        }

        for (int num : nums2) {
            nums2Map.merge(num, 1, Integer::sum);
        }
        List<Integer> intersection = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : nums1Map.entrySet()) {
            int num = entry.getKey();
            int countInNums1 = entry.getValue();
            if (nums2Map.containsKey(num)) {
                int countInNums2 = nums2Map.get(num);
                int commonCount = Math.min(countInNums1, countInNums2);
                for (int i = 0; i < commonCount; i++) {
                    intersection.add(num);
                }
            }
        }
        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }
        return result;
    }
}



/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
 */
