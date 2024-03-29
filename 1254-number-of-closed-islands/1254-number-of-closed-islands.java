// class Solution {
//     public int closedIsland(int[][] grid) {
//         int rows = grid.length;
        
//         if (rows == 0) {
//             return 0;
//         }
        
//         int cols = grid[0].length;
        
//         int noOfisland = 0;
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 if (grid[i][j] == 1) {
//                     dfs(grid, i, j, rows, cols);
//                     noOfisland += 1;
//                 }
//             }
//         }
//         return noOfisland - 1;
//     }
    
//     public static void dfs(int[][] grid, int i, int j, int rows, int cols) {
//         if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] != 1)
//             return;
        
//         grid[i][j] = 2;
        
//         dfs(grid, i + 1, j, rows, cols);
//         dfs(grid, i, j + 1, rows, cols);
//         dfs(grid, i - 1, j, rows, cols);
//         dfs(grid, i, j - 1, rows, cols);
//     }
// }

class Solution {
    public int closedIsland(int[][] grid) {
        int cnt=0;
        int n=grid.length,m=grid[0].length;
        boolean vis[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    cnt+=dfs(i,j,grid,vis,n,m);
                }
            }
        }
        return cnt;
    }
    public static int dfs(int i,int j,int a[][],boolean vis[][],int n,int m){
        if(i>=n||j>=m||i<0||j<0) return 0;
        if(a[i][j]==1) return 1;
        a[i][j]=1;
        int up=dfs(i-1,j,a,vis,n,m);
        int down=dfs(i+1,j,a,vis,n,m);
        int left=dfs(i,j-1,a,vis,n,m);
        int right=dfs(i,j+1,a,vis,n,m);
        return up&down&left&right;
    }
}