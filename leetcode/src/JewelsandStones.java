import java.util.HashMap;
import java.util.Map;

public class JewelsandStones{
    public static void main(String[] args) {

        System.out.println(JewelsandStones.numJewelsInStones("aA","aAAbbbb"));
    }

    private static int numJewelsInStones(String jewels, String stones) {

        Map<Character,Integer> map = new HashMap<>();
        String [] array = new String[jewels.length()];
        for (int i=0; i<jewels.length();i++) array[i] = String.valueOf(jewels.charAt(i));

        for(int i=0; i<stones.length();i++){
            map.merge(stones.charAt(i), 1, Integer::sum);
        }
        int counter = 0;
        for (String jewel : array) {
            if (map.containsKey(jewel.charAt(0))) {
                counter += map.get(jewel.charAt(0));
            }
        }
            return counter;
    }
}

/*
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0
 */
