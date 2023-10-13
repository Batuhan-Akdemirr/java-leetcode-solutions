import java.util.LinkedList;
import java.util.List;

public class KeyboardRow {
    public static void main(String[] args) {
        String []  words = {"Hello","Alaska","Dad","Peace"};
        KeyboardRow.findWords(words);
    }

    private static String[] findWords(String[] words) {
        String one = "qwertyuiopQWERTYUIOP";
        String two = "asdfghjklASDFGHJKL";
        String three = "zxcvbnmZXCVBNM";
        List<String> list = new LinkedList<>();

        for (String word : words) {
            if (check(word, one) || check(word, two) || check(word, three)) {
                list.add(word);
            }
        }
        String[] arr = new String[list.size()];

        for (int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);

        return arr;

    }

    private static boolean check(String s, String checker) {
        for (char c : s.toCharArray()) {
            if (!checker.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }
}


/*
* Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".
*  */