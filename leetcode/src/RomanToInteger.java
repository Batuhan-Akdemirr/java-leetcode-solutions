
import java.util.HashMap;
import java.util.Map;
public class RomanToInteger {
    public static void main(String[] args) {

        System.out.println(RomanToInteger.romanToInt("VI"));

    }
    private  static  int romanToInt(String S) {
        Map<Character, Integer> myMap = new HashMap<>();
        myMap.put('I', 1);
        myMap.put('V', 5);
        myMap.put('X', 10);
        myMap.put('L', 50);
        myMap.put('C', 100);
        myMap.put('D', 500);
        myMap.put('M', 1000);

        int n = S.length();
        int num = myMap.get(S.charAt(n - 1)) != null ? myMap.get(S.charAt(n - 1)) : 0;
        for (int i = n - 2; i >= 0; i--) {
            if (myMap.get(S.charAt(i)) != null && myMap.get(S.charAt(i)) >= myMap.get(S.charAt(i + 1))) {
                num += myMap.get(S.charAt(i));
            } else {
                num -= myMap.get(S.charAt(i));
            }
        }

        return num;
    }
}

/*
* Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
* */