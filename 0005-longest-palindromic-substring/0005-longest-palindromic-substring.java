class Solution {
    public String longestPalindrome(String s) {
        String rst = "";
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            int longest = Math.min(i, n-i+1);
            if(rst.length() > longest*2)
                return rst;
            String cur = helper(s, i-1, i+1);
            if(cur.length()>rst.length())
                rst = cur;
            cur = helper(s, i, i+1);
            if(cur.length()>rst.length())
                rst = cur;
        }
        return rst;
    }
    public String helper(String s, int left,int right){
        int n = s.length();
        while(left>=0 && right<n 
              && s.charAt(left) == s.charAt(right))
        {
            left--;
            right++;
        }
        return s.substring(left+1, right);
    }
}