class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxElement = Arrays.stream(nums).max().getAsInt();
        long ans = 0;
        int start = 0, end = 0;
        long maxEleInWindow = 0;
        for (end = 0; end < nums.length; end++) {
            if (nums[end] == maxElement) 
                maxEleInWindow++;
            
            while(k == maxEleInWindow) {
                if (nums[start] == maxElement) {
                    maxEleInWindow--;
                }
                start++;
            }
            ans += start;
        }
        return ans;
    }
}