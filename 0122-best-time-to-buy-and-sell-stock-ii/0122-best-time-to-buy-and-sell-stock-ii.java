class Solution {
    public static int solve(int index, int buy, int[] prices, int[][] dp) {
        // Base case: if index exceeds or matches the length of the array, no profit can be made
        if (index == prices.length) {
            return 0;
        }

        // Check if the result is already computed
        if (dp[index][buy] != -1) {
            return dp[index][buy];
        }

        int profit = 0;

        if (buy == 1) {
            // Either buy the stock or skip
            int buying = -prices[index] + solve(index + 1, 0, prices, dp);
            int skipping = solve(index + 1, 1, prices, dp);
            profit = Math.max(buying, skipping);
        } else {
            // Either sell the stock or skip
            int selling = prices[index] + solve(index + 1, 1, prices, dp);
            int skipping = solve(index + 1, 0, prices, dp);
            profit = Math.max(selling, skipping);
        }

        // Store the result in dp table
        dp[index][buy] = profit;
        return profit;
    }
    
    public static int tabulationMethod() {
        return 0;
    }
    
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return solve(0, 1, prices, dp);
    }
}