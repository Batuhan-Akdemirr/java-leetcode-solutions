public class CounttheDigitsThatDivideaNumber {
    public static void main(String[] args) {
        System.out.println(CounttheDigitsThatDivideaNumber.countDigits(1248));
    }

    private static int countDigits(int num) {

        int counter =0;
        String stringNum = String.valueOf(num);

        for(int i=0; i<stringNum.length(); i++){
            String digitStr = String.valueOf(stringNum.charAt(i));
            int digit = Integer.parseInt(digitStr);
            if(num % digit == 0) counter++;
        }
        return counter;
    }


}

/*
Given an integer num, return the number of digits in num that divide num.

An integer val divides nums if nums % val == 0.

Example 1:

Input: num = 7
Output: 1
Explanation: 7 divides itself, hence the answer is 1.
Example 2:

Input: num = 121
Output: 2
Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.
Example 3:

Input: num = 1248
Output: 4
Explanation: 1248 is divisible by all of its digits, hence the answer is 4.
* */