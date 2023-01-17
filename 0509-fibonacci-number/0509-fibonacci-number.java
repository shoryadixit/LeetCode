class Solution {
    public int fib(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int ans = dpS(n, dp);
        return ans;
    }
    
    public static int dpS(int n, int[] dp) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (dp[n] != -1)
            return dp[n];
        else
            return dp[n] = dpS(n - 1, dp) + dpS(n - 2, dp);
    }
}