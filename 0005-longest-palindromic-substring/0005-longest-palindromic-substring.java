class Solution {
    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
    
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        
        int st = 0, ed = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int l1 = expandAroundCenter(s, i , i);
            int l2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(l1, l2);
            if (len > ed - st) {
                st = i - (len - 1) / 2;
                ed = i + len / 2;
            }
        }
        return s.substring(st, ed + 1);
    }
}