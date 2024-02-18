public class WaterBottles {
    public static void main(String[] args) {
        System.out.println(WaterBottles.numWaterBottles(9,3));
    }

    private static int numWaterBottles(int numBottles, int numExchange) {
        int count=numBottles;
        while(numExchange <= numBottles){
            int q=numBottles /numExchange;
            int r=numBottles % numExchange;
            count= count + q;
            numBottles= q + r;
        }
        return count;
    }
}


/*
There are numBottles water bottles that are initially full of water. You can exchange numExchange empty water bottles from the market with one full water bottle.

The operation of drinking a full water bottle turns it into an empty bottle.

Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.

Example 1:


Input: numBottles = 9, numExchange = 3
Output: 13
Explanation: You can exchange 3 empty bottles to get 1 full water bottle.
Number of water bottles you can drink: 9 + 3 + 1 = 13.
Example 2:


Input: numBottles = 15, numExchange = 4
Output: 19
Explanation: You can exchange 4 empty bottles to get 1 full water bottle.
Number of water bottles you can drink: 15 + 3 + 1 = 19.
 */