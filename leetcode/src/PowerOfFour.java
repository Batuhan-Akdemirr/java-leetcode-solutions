public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println(PowerOfFour.isPowerOfFour(16));
    }

    private static boolean isPowerOfFour(int n) {
        if (n <= 0) return  false;

        while (n > 1) {
            if (n % 4 != 0) {
                return false;
            }
            n /= 4;
        }

        return true;
    }
}


/*
*
Given an integer n, return true if it is a power of four. Otherwise, return false.
An integer n is a power of four, if there exists an integer x such that n == 4x.
* */