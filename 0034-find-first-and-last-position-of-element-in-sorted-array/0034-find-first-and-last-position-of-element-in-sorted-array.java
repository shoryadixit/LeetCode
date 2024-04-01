class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] output = { -1, -1 };
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        output[0] = start;
        output[1] = end;
        return output;
    }

    public static int search(int[] arr, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}