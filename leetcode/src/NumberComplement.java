public class NumberComplement {
    public static void main(String[] args) {
        System.out.println(NumberComplement.findComplement(1));
    }

    private static int findComplement(int num) {

        String  numStr = Integer.toBinaryString(num);
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0; i<numStr.length();i++){
            if(numStr.charAt(i) == '1') stringBuilder.append('0');
            else stringBuilder.append('1');
        }
        return  Integer.parseInt(stringBuilder.toString(), 2);
    }
}

/*
The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.

For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
Given an integer num, return its complement.

Example 1:

Input: num = 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
Example 2:

Input: num = 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
* */
