class Solution {
    public int numSquares(int n) {
//          DP--Based Solution
//         int arr[] = new int[n + 1];
//         arr[0] = 0;
//         arr[1] = 1;
        
//         for (int i = 2; i <= n; i++) {
//             int min = Integer.MAX_VALUE;
//             for (int j = 1; j * j <= i; j++) {
//                 int rem = i - j * j;
//                 if (arr[rem] < min)
//                     min = arr[rem];
//             }
//             arr[i] = min + 1;
//         }
//         return arr[n];
        
        // Legrange Four square theorem Based-- Solution
        
        while (n % 4 == 0)  n /= 4;
        if (n % 8 == 7) return 4;
        
        for(int i = 0; i * i <= n; i++){
            int y = (int)Math.sqrt(n - i * i);
            if(i * i + y * y == n){
                if(i == 0 || y == 0) return 1;
                else return 2;
            }
        }
        return 3;
    }
}