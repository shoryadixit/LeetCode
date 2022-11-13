class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> stack = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!stack.contains(nums[i])) {
                stack.add(nums[i]);
            } else {
                return true;
            }
        }
        return false;
    }
}