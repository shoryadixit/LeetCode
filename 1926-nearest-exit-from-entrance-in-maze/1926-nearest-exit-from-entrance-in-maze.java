class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int r = maze.length;
        int col = maze[0].length;

        Queue<int[]> que = new LinkedList<>();
        que.offer(entrance);
        maze[entrance[0]][entrance[1]] = '+';

        int[][] dirs = new int[][] {{0,1},{0,-1},{1,0},{-1,0}};

        int step = 0;
        int x, y;
        while (!que.isEmpty()) {
            step++;

            int n = que.size();
            for (int i = 0; i < n; i++) {
                int[] cur = que.poll();

                for (int[] dir : dirs) {
                    x = cur[0] + dir[0];
                    y = cur[1] + dir[1];

                    if (x < 0 || x >= r || y < 0 || y >= col) continue;
                    if (maze[x][y] == '+') continue;

                    if (x == 0 || x == r - 1 || y == 0 || y == col - 1) return step;

                    maze[x][y] = '+';
                    que.offer(new int[]{x, y});
                }
            }
        }
        return -1;
    }
}