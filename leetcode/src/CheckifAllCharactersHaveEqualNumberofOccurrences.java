import java.util.HashMap;

public class CheckifAllCharactersHaveEqualNumberofOccurrences {
    public static void main(String[] args) {
        System.out.println(CheckifAllCharactersHaveEqualNumberofOccurrences.areOccurrencesEqual("aabbcc"));
    }


    private static boolean areOccurrencesEqual(String s) {

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i =0; i< s.length(); i++) {
            hashMap.merge(s.charAt(i) , 1 , Integer::sum );
        }

        int count = hashMap.get(s.charAt(0));
        for (Character key : hashMap.keySet())  {
         if(count != hashMap.get(key)) {
             return false;
         }
        }

        return true;
    }
}

/*
Given a string s, return true if s is a good string, or false otherwise.

A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).



Example 1:

Input: s = "abacbc"
Output: true
Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.
Example 2:

Input: s = "aaabb"
Output: false
Explanation: The characters that appear in s are 'a' and 'b'.
'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.

 */