import java.util.HashMap;
import java.util.Map;

public class ElementAppearingMoreThan25InSortedArray {
    public static void main(String[] args) {

      //  int [] arr = {1,2,2,6,6,6,6,7,10};
        int [] arr = {1,2};
        System.out.println( ElementAppearingMoreThan25InSortedArray.findSpecialInteger(arr));
    }

    private static int findSpecialInteger(int[] arr) {

        int frequency = arr.length / 4;

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int j : arr) {
            hashMap.merge(j, 1, Integer::sum);
        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() > frequency) return entry.getKey();
        }

        return 0;
    }


}


/*
Given an integer array sorted in non-decreasing order, there is exactly one integer in the array that occurs more than 25% of the time, return that integer.



Example 1:

Input: arr = [1,2,2,6,6,6,6,7,10]
Output: 6
Example 2:

Input: arr = [1,1]
Output: 1
 */