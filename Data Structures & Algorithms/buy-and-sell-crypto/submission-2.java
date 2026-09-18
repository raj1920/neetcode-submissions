class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int minBuy = prices[0];
        int maxProfit=0;
        for (int x:prices ){
            maxProfit = Math.max(maxProfit,x-minBuy);
            minBuy = Math.min(minBuy,x);
        }
    
         
      
        return maxProfit;
    }
}
