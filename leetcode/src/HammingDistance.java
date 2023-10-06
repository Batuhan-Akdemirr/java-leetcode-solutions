public class HammingDistance {
    public static void main(String[] args) {
        System.out.println(HammingDistance.hammingDistance(3,1));
    }

    private static int hammingDistance(int x, int y) {

        StringBuilder xBinary = new StringBuilder(Integer.toBinaryString(x));
        StringBuilder yBinary = new StringBuilder(Integer.toBinaryString(y))     ;
        int length = Math.abs((xBinary.length()-yBinary.length()));
        int counter =0;

        if(xBinary.length() < yBinary.length()){
            for(int i=0; i<length; i++){
                xBinary.insert(0, "0");
            }
        }
        else{
            for(int i=0; i<length; i++){
                yBinary.insert(0, "0");
            }
        }

        for(int i=0; i<xBinary.length();i++){
            if(xBinary.charAt(i) != yBinary.charAt(i)) counter++;
        }

        return  counter;
    }

}

/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
Given two integers x and y, return the Hamming distance between them.

Example 1:

Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
The above arrows point to positions where the corresponding bits are different.
Example 2:

Input: x = 3, y = 1
Output: 1
*/