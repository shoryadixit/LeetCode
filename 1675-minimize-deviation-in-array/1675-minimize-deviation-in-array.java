class Solution {
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num: nums) {
            if (num % 2 == 0) {
                set.add(num);
            } else {
                set.add(num * 2);
            }
        }
        int res = Integer.MAX_VALUE;
        while (true) {
            int x = set.last();
            res = Math.min (res, x - set.first());
            if (x % 2 == 0) {
                set.remove(x);
                set.add(x / 2);
            } else {
                break;
            }
        }
        return res;
    }
}