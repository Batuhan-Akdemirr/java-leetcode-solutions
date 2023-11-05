public class ShuffleString {
    public static void main(String[] args) {
        int [] nums = {4,5,6,7,0,2,1,3};

        System.out.println(ShuffleString.restoreString("codeleet", nums));
    }

    private static String restoreString(String s, int[] indices) {

        int length=s.length();
        StringBuilder sb=new StringBuilder();
        char[] c =new char[length];

        for(int i=0;i<length;i++){

            c[indices[i]]=s.charAt(i);

        }
        sb.append(c);
        return sb.toString();

    }
}

/*
You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.

Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
Example 2:

Input: s = "abc", indices = [0,1,2]
Output: "abc"
Explanation: After shuffling, each character remains in its position.
 */