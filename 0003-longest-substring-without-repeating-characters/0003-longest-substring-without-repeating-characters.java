class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int res = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            while (set.contains(c)) {
                set.remove(s.charAt(count++));
            }
            set.add(c);
            res = Math.max(res, i - count + 1); 
        }
        return res;
    }
}