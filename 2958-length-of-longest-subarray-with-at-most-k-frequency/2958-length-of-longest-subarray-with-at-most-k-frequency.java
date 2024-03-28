class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int ans = 0, start = -1;
        Map<Integer, Integer> frequencyMap = new HashMap();
        
        for (int end = 0; end < nums.length; end++) {
            frequencyMap.put(nums[end], frequencyMap.getOrDefault(nums[end], 0) + 1);
            while (frequencyMap.get(nums[end]) > k) {
                start++;
                frequencyMap.put(nums[start], frequencyMap.get(nums[start]) - 1);
            }
            ans = Math.max(ans, end - start);
        }
        
        return ans;
    }
}