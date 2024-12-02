class Solution {
    public static int solve(int index, int buy, int[] prices, int[][] dp) {
        if (index == prices.length) {
            return 0;
        }

        if (dp[index][buy] != -1) {
            return dp[index][buy];
        }

        int profit = 0;

        if (buy == 1) {
            int buying = -prices[index] + solve(index + 1, 0, prices, dp);
            int skipping = solve(index + 1, 1, prices, dp);
            profit = Math.max(buying, skipping);
        } else {
            int selling = prices[index] + solve(index + 1, 1, prices, dp);
            int skipping = solve(index + 1, 0, prices, dp);
            profit = Math.max(selling, skipping);
        }

        dp[index][buy] = profit;
        return profit;
    }
    
    public static int tabulationMethod(int[] prices) {
        int[][] dp = new int[prices.length + 1][2];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], 0);
        }
        
        for (int i = prices.length - 1; i >= 0; i--) {
            for (int j = 0; j <= 1; j++) {
                int profit = 0;

                if (j == 1) {
                    int buying = -prices[i] + dp[i + 1][0];
                    int skipping = dp[i + 1][1];
                    profit = Math.max(buying, skipping);
                } else {
                    int selling = prices[i] + dp[i + 1][1];
                    int skipping = dp[i + 1][0];
                    profit = Math.max(selling, skipping);
                }
                
                dp[i][j] = profit;
            }
        }
        return dp[0][1];
    }
    
    public int maxProfit(int[] prices) {
        // int[][] dp = new int[prices.length][2];
        // for (int i = 0; i < dp.length; i++) {
        //     Arrays.fill(dp[i], -1);
        // }
        // return solve(0, 1, prices, dp);
        
        return tabulationMethod(prices);
    }
}