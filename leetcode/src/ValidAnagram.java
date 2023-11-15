import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(ValidAnagram.isAnagram("anagram", "nagaram"));
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            sMap.merge(s.charAt(i), 1, Integer::sum);
            tMap.merge(t.charAt(i), 1, Integer::sum);
        }

        for (Map.Entry<Character, Integer> entry : sMap.entrySet()) {
            char key = entry.getKey();
            int value1 = entry.getValue();
            Integer value2 = tMap.get(key);

            if (!Objects.equals(value1, value2)) {
                return false;
            }
        }

        return true;
    }

}

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.


Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
 */
