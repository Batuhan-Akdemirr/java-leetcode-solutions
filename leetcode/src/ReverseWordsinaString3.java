public class ReverseWordsinaString3 {
    public static void main(String[] args) {
        System.out.println(ReverseWordsinaString3.reverseWords("Let's take LeetCode contest"));
    }
    private static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = reverseString(word);

            if (i != 0) {
                reversedSentence.append(" ");
            }

            reversedSentence.append(reversedWord);
        }

        return reversedSentence.toString();
    }

    private static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

}


/*
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "God Ding"
Output: "doG gniD"
* */