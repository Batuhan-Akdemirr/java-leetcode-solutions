import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        String input = "leetcode";
        System.out.println( reverseVowels(input));
    }

    private static String reverseVowels(String s) {

        List<Character> vowels = new ArrayList<>();
        List<Integer> vowelIndices = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isVowel(c)) {
                vowels.add(c);
                vowelIndices.add(i);
            }
        }

        StringBuilder result = new StringBuilder(s);
        for (int i = 0; i < vowels.size(); i++) {
            result.setCharAt(vowelIndices.get(i), vowels.get(vowels.size() - 1 - i));
        }

        return result.toString();
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}

/*
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.


Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"
 */