class Solution {
    public int maxProfit(int[] prices) {
        int lower = Integer.MAX_VALUE;
        int profit = 0;
        int profittoday = 0;
        
        for(int i = 0; i < prices.length; i++){
            if (prices[i] < lower){
                lower = prices[i];
            }
            profittoday = prices[i] - lower;
            if (profit < profittoday){
                profit = profittoday;
            }
        }
        return profit; 
    }
}