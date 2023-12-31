public class AddDigits {
    public static void main(String[] args) {
        System.out.println(AddDigits.addDigits(38));
    }

    private static int addDigits(int num) {

        if (num == 0) return 0;
        else if (num <= 9) return num;
        else {
            int s = 0;
            while (num > 0) {
                int k = num % 10;
                s = s + k;
                num = num / 10;
            }
            return addDigits(s);
        }
    }
}


/*
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2
Since 2 has only one digit, return it.
Example 2:

Input: num = 0
Output: 0
 */