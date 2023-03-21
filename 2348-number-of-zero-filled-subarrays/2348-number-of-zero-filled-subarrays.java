class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        long numsSubArray = 0;
        
        for (int num: nums) {
            if (num == 0) {
                numsSubArray++;
            } else {
                numsSubArray = 0;
            }
            
            ans += numsSubArray;
        }
        return ans;
    }
}