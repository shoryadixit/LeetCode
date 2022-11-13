class Solution {
    public String reverseWords(String s) {
        String res = "";
        int i = 0, N = s.length();
        while (i < N) {
            while (i < N  && s.charAt(i) == ' ') { 
                i++;
            }
            
            if (i >= N) break;
            
            int j = i + 1;
            
            while (j < N && s.charAt(j) != ' ') { 
                j++;
            }
            
            String sub = s.substring(i, j);
            
            if (res.length() == 0) {
                res = sub;
            }
            else {
                res = sub + " " + res;
            }
            i = j + 1;
        }
        return res;
    }
}