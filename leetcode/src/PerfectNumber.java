public class PerfectNumber {
    public static void main(String[] args) {

        System.out.println(PerfectNumber.checkPerfectNumber(7));
    }

    private static boolean checkPerfectNumber(int num) {

        int length = num/2;
        int divideSum = 0;

        for(int i=1; i<=length; i++) {
            if(num % i ==0) {
                divideSum += i;
            }
        }

        return divideSum == num;
    }
}

/*
A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.

Given an integer n, return true if n is a perfect number, otherwise return false.

Example 1:

Input: num = 28
Output: true
Explanation: 28 = 1 + 2 + 4 + 7 + 14
1, 2, 4, 7, and 14 are all divisors of 28.
Example 2:

Input: num = 7
Output: false
 */