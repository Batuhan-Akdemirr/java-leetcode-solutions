import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println(RansomNote.canConstruct("aa", "ab"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomNoteHash = new HashMap<>();
        Map<Character, Integer> magazineHash = new HashMap<>();

        for (char x : ransomNote.toCharArray()) {
            ransomNoteHash.merge(x,1,Integer::sum);
        }

        for(char x : magazine.toCharArray()){
            magazineHash.merge(x,1,Integer::sum);
        }


        for (Map.Entry<Character, Integer> entry : ransomNoteHash.entrySet()) {
            char c = entry.getKey();
            int ransomNoteCount = entry.getValue();
            int magazineCount = magazineHash.getOrDefault(c, 0);

            if (ransomNoteCount > magazineCount) {
                return false;
            }
        }

        return true; 
    }

}

/*
 Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
* */
