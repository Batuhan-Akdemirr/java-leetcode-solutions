import java.util.ArrayList;
import java.util.Collections;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int [] nums = {1,3,5,6};
        System.out.println(SearchInsertPosition.searchInsert(nums,2));
    }

    public static  int searchInsert(int[] nums, int target) {
        int index = whichIndexofArray(nums,target);

        if(index!=-1){
            return  index;
        }
        else{
            ArrayList<Integer> a = new ArrayList<Integer>();
            for (int num : nums) {
                a.add(num);
            }
            a.add(target);
            index = sortListandReturnTargetIndex(a,target);
            return  index;
        }
    }

    private  static  int whichIndexofArray(int [] nums , int target){
        int whichIndex =-1;

        for(int i=0; i< nums.length;i++){
            if(nums[i] ==target){
                whichIndex=i;
                break;
            }
        }

        return  whichIndex;
    }
    private static  int sortListandReturnTargetIndex(ArrayList<Integer> a, int target){
        int targetIndex=0;
        ArrayList<Integer> temp = new ArrayList<>();
        Collections.sort(a);

        for(int i=0; i< a.size();i++){
            if(a.get(i)== target ){
                targetIndex=i;
                return targetIndex;
            }
        }

        return  targetIndex;
    }
}

/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
 */