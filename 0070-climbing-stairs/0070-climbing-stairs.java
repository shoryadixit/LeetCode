class Solution {
    public int climbStairs(int n) {
        return (int) ((Math.pow(((1 + Math.sqrt(5)) / 2), n+1) - 
            Math.pow(((1 - Math.sqrt(5)) / 2), n+1)) / Math.sqrt(5));
        
        // int[] dp = new int[n + 1];
        // dp[0] = 1;
        // dp[1] = 1;
        // for (int i = 2; i <= n; i++){
        //     dp[i] = dp[i - 1] + dp[i - 2];
        // }
        // return dp[n];
    }
}