public class CountSymmetricIntegers {
    public static void main(String[] args) {

        CountSymmetricIntegers c1  = new CountSymmetricIntegers();
        System.out.println( c1.countSymmetricIntegers(10,100));

    }


    public  int countSymmetricIntegers(int low, int high) {
        int ans = 0;
        for (int i = low; i <= high; i++) {
            int digits = countDigit(i);
            if ((digits & 1) == 0) {
                int tempSum = 0;
                int k = 0;
                int temp = i;
                while (k != digits / 2) {
                    tempSum += temp % 10;
                    temp /= 10;
                    k += 1;
                }
                while (k != digits) {
                    tempSum -= temp % 10;
                    temp /= 10;
                    k += 1;
                }
                if (tempSum == 0) {
                    ans += 1;
                }
            }
        }
        return ans;
    }

    public int countDigit(int n) {
        int ans = 0;
        while (n != 0) {
            ans += 1;
            n /= 10;
        }
        return ans;
    }
}


/*
You are given two positive integers low and high.

An integer x consisting of 2 * n digits is symmetric if the sum of the first n digits of x is equal to the sum of the last n digits of x. Numbers with an odd number of digits are never symmetric.

Return the number of symmetric integers in the range [low, high].



Example 1:

Input: low = 1, high = 100
Output: 9
Explanation: There are 9 symmetric integers between 1 and 100: 11, 22, 33, 44, 55, 66, 77, 88, and 99.
Example 2:

Input: low = 1200, high = 1230
Output: 4
Explanation: There are 4 symmetric integers between 1200 and 1230: 1203, 1212, 1221, and 1230.
 */