import java.util.ArrayList;
import java.util.List;

public class IntersectionofTwoArrays {
    public static void main(String[] args) {
        int [] array1 = {4,9,5};
        int [] array2 = {9,4,9,8,4};
        IntersectionofTwoArrays.intersection(array1,array2 );
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<Integer>();

        for (int k : nums1) {
            for (int i : nums2) {
                if (k == i) {
                    if (!list.contains(k)) list.add(k);
                }
            }
        }


        int [] array = new int[list.size()];
        for(int i=0; i< array.length;i++){
            array[i] = list.get(i);
        }
        return array;

    }


}


/*
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.*/