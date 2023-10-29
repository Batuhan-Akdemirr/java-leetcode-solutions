import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PointsThatIntersectWithCars {
    public static void main(String[] args) {

        List<List<Integer>> nums = new ArrayList<>();

        List<Integer> innerList1 = new ArrayList<>();
        innerList1.add(3);
        innerList1.add(6);

        List<Integer> innerList2 = new ArrayList<>();
        innerList2.add(1);
        innerList2.add(5);

        List<Integer> innerList3 = new ArrayList<>();
        innerList3.add(4);
        innerList3.add(7);


        nums.add(innerList1);
        nums.add(innerList2);
        nums.add(innerList3);


        System.out.println(PointsThatIntersectWithCars.numberOfPoints(nums));
    }

    private static int numberOfPoints(List<List<Integer>> nums) {

        Set<Integer> set = new HashSet();
        for(List<Integer> al : nums) {
            for(int i = al.get(0); i <= al.get(1); i++) {
                set.add(i);
            }
        }
        return set.size();
    }


}

/*
You are given a 0-indexed 2D integer array nums representing the coordinates of the cars parking on a number line. For any index i, nums[i] = [starti, endi] where starti is the starting point of the ith car and endi is the ending point of the ith car.

Return the number of integer points on the line that are covered with any part of a car.

Example 1:

Input: nums = [[3,6],[1,5],[4,7]]
Output: 7
Explanation: All the points from 1 to 7 intersect at least one car, therefore the answer would be 7.
Example 2:

Input: nums = [[1,3],[5,8]]
Output: 7
Explanation: Points intersecting at least one car are 1, 2, 3, 5, 6, 7, 8. There are a total of 7 points, therefore the answer would be 7.
 */
