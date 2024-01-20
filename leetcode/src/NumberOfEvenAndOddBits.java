public class NumberOfEvenAndOddBits {
    public static void main(String[] args) {
        System.out.println(NumberOfEvenAndOddBits.evenOddBit(17));
    }

    private static int[] evenOddBit(int n) {
        int[] res = new int[2];
        String bit = Integer.toBinaryString(n);
        for(int i=bit.length()-1, k=0; i>=0; i--){
            if(i % 2 == 0)  res[0] += bit.charAt(k++) - '0';
            else res[1] += bit.charAt(k++) - '0';
        }
        return res;
    }
}

/*
You are given a positive integer n.

Let even denote the number of even indices in the binary representation of n (0-indexed) with value 1.

Let odd denote the number of odd indices in the binary representation of n (0-indexed) with value 1.

Return an integer array answer where answer = [even, odd].



Example 1:

Input: n = 17
Output: [2,0]
Explanation: The binary representation of 17 is 10001.
It contains 1 on the 0th and 4th indices.
There are 2 even and 0 odd indices.
Example 2:

Input: n = 2
Output: [0,1]
Explanation: The binary representation of 2 is 10.
It contains 1 on the 1st index.
There are 0 even and 1 odd indices.
 */