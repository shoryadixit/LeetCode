class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length * mat[0].length != r * c){
            return mat;                        
        }            
        int[][] ans = new int[r][c];
        int x = 0, y = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[0].length; j++){
                ans[x][y++] = mat[i][j];
                if (y == c){
                    x++;
                    y = 0;
                }   
            }
        }
        return ans;

    }
}