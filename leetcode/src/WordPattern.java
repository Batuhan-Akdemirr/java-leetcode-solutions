import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public static void main(String[] args) {
        System.out.println(WordPattern.wordPattern("abba","dog dog dog dog"));
    }

    private static boolean wordPattern(String pattern, String s) {

        String[] sArray = s.split(" ");

        if (pattern.length() != sArray.length) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char patternChar = pattern.charAt(i);
            String sString = sArray[i];

            if (map.containsKey(patternChar)) {
                if (!map.get(patternChar).equals(sString)) {
                    return false;
                }
            } else {
                if (map.containsValue(sString)) {
                    return false;
                }
                map.put(patternChar, sString);
            }
        }

        return true;
    }
}

/*
Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
 */
