class Solution {
    public int maximum69Number (int num) {
        String numString = "" + num;
        return Integer.parseInt(numString.replaceFirst("6", "9"));
    }
}