public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(ValidPalindrome.isPalindrome("OP"));
    }

    private static boolean isPalindrome(String s) {

        String cleanedString = s.replaceAll("[^a-zA-Z]+", "").toLowerCase();
        StringBuilder reversedString = new StringBuilder(cleanedString).reverse();
        return reversedString.toString().equals(cleanedString);
    }

}
