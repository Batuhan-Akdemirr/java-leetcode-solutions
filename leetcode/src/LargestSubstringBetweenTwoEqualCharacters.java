import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LargestSubstringBetweenTwoEqualCharacters {
    public static void main(String[] args) {

        System.out.println(LargestSubstringBetweenTwoEqualCharacters.maxLengthBetweenEqualCharacters("abcdefghikjhfa"));
    }

    private static int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            map.computeIfAbsent(letter, k -> new ArrayList<>());
            map.get(letter).add(i);
        }

        int maxSubstringLength = -1;

        for (Map.Entry<Character, ArrayList<Integer>> entry : map.entrySet()) {
            ArrayList<Integer> indices = entry.getValue();

            if (indices.size() < 2) {
                continue;
            }

            int substringLength = indices.get(indices.size() - 1) - indices.get(0) - 1;

            maxSubstringLength = Math.max(maxSubstringLength, substringLength);
        }

        return maxSubstringLength;
    }

}


/*
Given a string s, return the length of the longest substring between two equal characters, excluding the two characters. If there is no such substring return -1.

A substring is a contiguous sequence of characters within a string.

Example 1:

Input: s = "aa"
Output: 0
Explanation: The optimal substring here is an empty substring between the two 'a's.
Example 2:

Input: s = "abca"
Output: 2
Explanation: The optimal substring here is "bc".
Example 3:

Input: s = "cbzxy"
Output: -1
Explanation: There are no characters that appear twice in s.

 */