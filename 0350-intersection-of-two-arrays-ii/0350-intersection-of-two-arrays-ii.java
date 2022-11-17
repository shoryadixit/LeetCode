class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length) return intersect(nums2, nums1);
        int[] map = new int[1_001];
        for (int num: nums2) {
            map[num]++;
        }
        int j = 0;
        for(int i = 0; i < nums1.length; i++) {
            if(map[nums1[i]]-- > 0) {
                nums1[j++] = nums1[i];
            }
        }
        if (j == nums1.length) return nums1;
        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = nums1[i];
        }
        return result;
    }
}