public class FaultyKeyboard {
    public static void main(String[] args) {
       // System.out.println( FaultyKeyboard.finalString("string"));
        System.out.println( FaultyKeyboard.finalString("poiinter"));
    }

    private static String finalString(String s) {
        StringBuilder result = new StringBuilder();
        boolean reverse = false;

        for (char c : s.toCharArray()) {
            if (c == 'i') {
                reverse = !reverse;
            } else {
                if (reverse) {
                    result.insert(0, c);
                } else {
                    result.append(c);
                }
            }
        }

        if (reverse) {
            result.reverse();
        }

        return result.toString();
    }
}
