public class AddStrings {
    public static void main(String[] args) {
        System.out.println(AddStrings.addStrings("6913259244","71103343"));
    }

    private static String addStrings(String num1, String num2) {
        int carry = 0;
        StringBuilder res = new StringBuilder();
        for (int i=num1.length()-1,j=num2.length()-1;i>=0||j>=0;i--,j--) {
            int a = i < 0 ? 0 : num1.charAt(i) - '0';
            int b = j < 0 ? 0 : num2.charAt(j) - '0';
            int sum=(a + b + carry);
            res.append(sum % 10);
            carry = sum / 10;
        }
        return (carry == 1 ? res.append('1') : res).reverse().toString();
    }


}


/*
Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.

Example 1:

Input: num1 = "11", num2 = "123"
Output: "134"
Example 2:

Input: num1 = "456", num2 = "77"
Output: "533"
Example 3:

Input: num1 = "0", num2 = "0"
Output: "0"
 */