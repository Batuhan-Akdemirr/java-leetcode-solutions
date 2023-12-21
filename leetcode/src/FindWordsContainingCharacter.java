import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public static void main(String[] args) {

        String [] words = {"abc","bcd","aaaa","cbc"};
        FindWordsContainingCharacter.findWordsContaining(words, 'a');
    }

    private static List<Integer> findWordsContaining(String[] words, char x) {

        ArrayList<Integer> indexList = new ArrayList<>();

        for(int i=0; i< words.length; i++) {
            String word = words[i];
            for(int j=0; j<word.length(); j++){
                if(x == word.charAt(j)) {
                    indexList.add(i);
                    break;
                }
            }
        }

        return indexList;
    }
}

/*
You are given a 0-indexed array of strings words and a character x.

Return an array of indices representing the words that contain the character x.

Note that the returned array may be in any order.



Example 1:

Input: words = ["leet","code"], x = "e"
Output: [0,1]
Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.
Example 2:

Input: words = ["abc","bcd","aaaa","cbc"], x = "a"
Output: [0,2]
Explanation: "a" occurs in "abc", and "aaaa". Hence, we return indices 0 and 2.
Example 3:

Input: words = ["abc","bcd","aaaa","cbc"], x = "z"
Output: []
Explanation: "z" does not occur in any of the words. Hence, we return an empty array.
 */