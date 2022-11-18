class Solution {
    public int firstUniqChar(String s) {
        int[] ret = new int[26];
        for(int i = 0; i < s.length(); i++) {
            ret[s.charAt(i)-'a']++;
        }
        for(int i = 0; i < s.length(); i++) {
            if(ret[s.charAt(i) - 'a'] == 1)
                return i;
        }
                return -1;
    }
}