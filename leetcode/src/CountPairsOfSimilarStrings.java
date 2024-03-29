import java.util.HashMap;
import java.util.Map;

public class CountPairsOfSimilarStrings {
    public static void main(String[] args) {
        String [] words = {"aba","aabb","abcd","bac","aabc"};
        System.out.println(CountPairsOfSimilarStrings.similarPairs(words));
    }

    private static int similarPairs(String[] words) {
        Map<Integer, Integer> group = new HashMap<>();
        for (String word : words) {
            group.merge(convert(word), 1, Integer::sum);
        }

        int count = 0;
        for (int value : group.values()) {
            count += value * (value - 1) / 2;
        }

        return count;
    }

    private static int convert(String word) {
        int n = 0;
        for (char c : word.toCharArray()) {
            n |= 1 << (c - 'a');
        }

        return n;
    }
}

/*
You are given a 0-indexed string array words.

Two strings are similar if they consist of the same characters.

For example, "abca" and "cba" are similar since both consist of characters 'a', 'b', and 'c'.
However, "abacba" and "bcfd" are not similar since they do not consist of the same characters.
Return the number of pairs (i, j) such that 0 <= i < j <= word.length - 1 and the two strings words[i] and words[j] are similar.

Example 1:

Input: words = ["aba","aabb","abcd","bac","aabc"]
Output: 2
Explanation: There are 2 pairs that satisfy the conditions:
- i = 0 and j = 1 : both words[0] and words[1] only consist of characters 'a' and 'b'.
- i = 3 and j = 4 : both words[3] and words[4] only consist of characters 'a', 'b', and 'c'.
Example 2:

Input: words = ["aabb","ab","ba"]
Output: 3
Explanation: There are 3 pairs that satisfy the conditions:
- i = 0 and j = 1 : both words[0] and words[1] only consist of characters 'a' and 'b'.
- i = 0 and j = 2 : both words[0] and words[2] only consist of characters 'a' and 'b'.
- i = 1 and j = 2 : both words[1] and words[2] only consist of characters 'a' and 'b'.
Example 3:

Input: words = ["nba","cba","dba"]
Output: 0
Explanation: Since there does not exist any pair that satisfies the conditions, we return 0.
 */