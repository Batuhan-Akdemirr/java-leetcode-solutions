public class ToLowerCase {
    public static void main(String[] args) {
        System.out.println(ToLowerCase.toLowerCase("HeLLoM"));
    }
    private static String toLowerCase(String s) {
        return s.toLowerCase();
    }
}

/*
Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

Example 1:

Input: s = "Hello"
Output: "hello"
Example 2:

Input: s = "here"
Output: "here"
Example 3:

Input: s = "LOVELY"
Output: "lovely"
 */
