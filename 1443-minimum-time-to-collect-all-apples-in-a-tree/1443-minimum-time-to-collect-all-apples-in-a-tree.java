class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        Map<Integer, List<Integer>> adjList = new HashMap();
        
        for(int[] edge : edges){
            adjList.computeIfAbsent(edge[0], vertex -> new ArrayList<Integer>()).add(edge[1]);
            adjList.computeIfAbsent(edge[1], vertex -> new ArrayList<Integer>()).add(edge[0]);
        }
        
        int res = dfs(-1, 0, adjList, hasApple);
        
        return res > 0 ? res - 2 : res;
    }
    
    private int dfs(int par, int child, Map<Integer, List<Integer>> adjList, List<Boolean> hasApple){
        int total = 0;
        
        for(Integer neigh : adjList.get(child)){
            if(neigh == par)
                continue;
            total += dfs(child, neigh, adjList, hasApple);
        }
        
        if(hasApple.get(child) || total > 0)
            total += 2;
        return total;
    }
}