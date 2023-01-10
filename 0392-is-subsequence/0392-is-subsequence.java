class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0)   return true;
        int s_point = 0;
        int t_point = 0;
        
        while (t_point < t.length()) {
            if (t.charAt(t_point) == s.charAt(s_point))
                s_point++;
            if (s_point == s.length())   return true;
            
            t_point++;
        }
        return false;
    }
}