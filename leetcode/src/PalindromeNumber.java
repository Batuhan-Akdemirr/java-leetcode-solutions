public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(  PalindromeNumber.isPalindrome(21));
    }

    private static boolean isPalindrome(int x) {

        if(x<0) return false;
        if(x<=9) return  true;

        String digits = String.valueOf(x);
        for(int i=0, j=digits.length()-1; i<digits.length()/2; i++, j--){
            if(digits.charAt(i)!= digits.charAt(j)) return false;
        }
        return true;

    }

}

/*
Given an integer x, return true if x is a
palindrome
, and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */