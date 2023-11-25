public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {

        int [] array = {7,1,5,3,6,4};
        int [] array2 = {7,6,5,4,3,2,1};
        int [] array3 = {1,2};
        System.out.println(maxProfit(array3));
    }

    public static int maxProfit(int[] prices) {
      int minValue=prices[0];
      int bestPrice =0;
      for(int i=0; i<prices.length-1; i++){
          if(prices[i] < prices[i+1]){
              if(prices[i] <= minValue){
                  minValue = prices[i];
                  for(int j=i; j<prices.length; j++){
                      if(bestPrice < prices[j] - minValue) bestPrice = prices[j] -minValue;
                  }
              }
          }
     }

     return bestPrice;
    }
}

/*
* You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
* */
