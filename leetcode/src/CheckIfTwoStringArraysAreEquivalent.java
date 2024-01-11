public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {

        String [] word1 = {"abc","d","defg"};
        String [] word2 = {"abcddefg"};

        System.out.println(CheckIfTwoStringArraysAreEquivalent.arrayStringsAreEqual(word1,word2));
    }

    private static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (String string : word1) {
            s1.append(string);
        }

        for (String s : word2) {
            s2.append(s);
        }

        return s1.compareTo(s2) == 0;

    }


}

/*
Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.


Example 1:

Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
Example 2:

Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false
Example 3:

Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true
 */
