import java.util.ArrayList;
import java.util.List;

public class SumofValuesatIndicesWithKSetBits {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(10);
        nums.add(1);
        nums.add(5);
        nums.add(2);

        System.out.println(SumofValuesatIndicesWithKSetBits.sumIndicesWithKSetBits(nums,1));
    }

    private  static     int sumIndicesWithKSetBits(List<Integer> nums, int k) {

        int sum = 0;
        for (int i = 0; i < nums.size(); i++)
            if (Integer.bitCount(i) == k)
                sum += nums.get(i);
        return sum;
    }

}

/*
You are given a 0-indexed integer array nums and an integer k.

Return an integer that denotes the sum of elements in nums whose corresponding indices have exactly k set bits in their binary representation.

The set bits in an integer are the 1's present when it is written in binary.

For example, the binary representation of 21 is 10101, which has 3 set bits.


Example 1:

Input: nums = [5,10,1,5,2], k = 1
Output: 13
Explanation: The binary representation of the indices are:
0 = 000
1 = 001
2 = 010
3 = 011
4 = 100
Indices 1, 2, and 4 have k = 1 set bits in their binary representation.
Hence, the answer is nums[1] + nums[2] + nums[4] = 13.
Example 2:

Input: nums = [4,3,2,1], k = 2
Output: 1
Explanation: The binary representation of the indices are:
0 = 00
1 = 01
2 = 10
3 = 11
Only index 3 has k = 2 set bits in its binary representation.
Hence, the answer is nums[3] = 1.
 */