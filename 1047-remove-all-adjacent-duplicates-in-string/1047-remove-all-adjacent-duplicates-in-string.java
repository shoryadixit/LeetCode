class Solution {
    public String removeDuplicates(String S) {
        char[] chars = S.toCharArray();
        int writeIndex = -1;
        for (char c : chars) {
            if (writeIndex >= 0 && c == chars[writeIndex]) {
                writeIndex--;
            } else {
                chars[++writeIndex] = c;
            }
        }
        return String.valueOf(chars, 0, writeIndex + 1);
    }
}