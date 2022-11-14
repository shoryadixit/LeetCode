class Solution {
    public static boolean[] visited;
    
    public static void dfs(int idx, int[][] stones) {
        visited[idx] = true;
        
        for (int i = 0; i < stones.length; i++) {
            if (visited[i])
                continue;
            if (stones[idx][0] == stones[i][0] || stones[idx][1] == stones[i][1])
                dfs (i, stones);
        }
        return;
    }
    
    public int removeStones(int[][] stones) {
        visited = new boolean[stones.length];
        Arrays.fill(visited, false);
        int val = 0;
        for (int i = 0; i < stones.length; i++) {
            if (visited[i] == true)
                continue;
            val++;
            dfs(i, stones);
        }
        return stones.length - val;
    }
}