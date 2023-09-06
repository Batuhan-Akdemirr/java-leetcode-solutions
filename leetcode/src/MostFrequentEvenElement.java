import java.util.HashMap;
import java.util.Map;

public class MostFrequentEvenElement {
    public static void main(String[] args) {
        int [] arrays = {0,1,2,2,4,4,1};
        int [] arrays2 = {4,4,4,9,2,4};
        System.out.println(MostFrequentEvenElement.mostFrequentEven(arrays));
    }

    private static int mostFrequentEven(int[] nums) {

        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int x : nums) {
            if (x % 2 == 0) {
                hashMap.merge(x, 1, Integer::sum);
            }
        }
        int frequentEvenCount = -1, mx = 0;
        for (var item : hashMap.entrySet()) {
            int hashMapKey = item.getKey(), hashMapValue = item.getValue();
            if (mx < hashMapValue || (mx == hashMapValue && frequentEvenCount > hashMapKey)) {
                frequentEvenCount = hashMapKey;
                mx = hashMapValue;
            }
        }
        return frequentEvenCount;
    }
}


/*
Given an integer array nums, return the most frequent even element.
If there is a tie, return the smallest one. If there is no such element, return -1.
*/