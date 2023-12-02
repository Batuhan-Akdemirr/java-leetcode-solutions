import java.util.HashMap;

public class FindWordsThatCanBeFormedbyCharacters {
    public static void main(String[] args) {
        String [] words = {"hello","world","leetcode"};
        String chars = "welldonehoneyr";
        System.out.println( FindWordsThatCanBeFormedbyCharacters.countCharacters(words, chars));
    }

    private static int countCharacters(String[] words, String chars) {
        int sum = 0;
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char element : chars.toCharArray()) {
            charCountMap.merge(element, 1, Integer::sum);
        }
        for (String word : words) {
            if (isGoodWord(word, new HashMap<>(charCountMap))) {
                sum += word.length();
            }
        }
        return sum;
    }

    private static boolean isGoodWord(String word, HashMap<Character, Integer> charCountMap) {
        for (char c : word.toCharArray()) {
            if (!charCountMap.containsKey(c) || charCountMap.get(c) <= 0) {
                return false;
            }
            charCountMap.put(c, charCountMap.get(c) - 1);
        }
        return true;
    }
}

/*
You are given an array of strings words and a string chars.

A string is good if it can be formed by characters from chars (each character can only be used once).

Return the sum of lengths of all good strings in words.



Example 1:

Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
Example 2:

Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10
Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
 */