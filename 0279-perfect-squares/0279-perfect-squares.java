class Solution {
    public int numSquares(int n) {
        int arr[] = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                int rem = i - j * j;
                if (arr[rem] < min)
                    min = arr[rem];
            }
            arr[i] = min + 1;
        }
        return arr[n];
    }
}