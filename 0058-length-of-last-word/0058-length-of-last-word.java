class Solution {
    public int lengthOfLastWord(String s) {
        if (s.length() > 0) {
            String[] arr = s.split(" ");
            String res = arr[arr.length - 1];
            System.out.println(res);
            return res.length();   
        }
        return 0;
    }
}