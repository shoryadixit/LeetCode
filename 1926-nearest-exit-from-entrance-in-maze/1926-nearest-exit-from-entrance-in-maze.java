class Solution {
     public boolean isValidRoom(int row, int col, char[][] maze) {
		if (row < 0 || row >= maze.length || col < 0 || col >= maze[0].length || maze[row][col] == '+') {
			return false;
		}
		maze[row][col] = '+';
		return true;
	}
    
    public int nearestExit(char[][] maze, int[] entrance) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(entrance);
        maze[entrance[0]][entrance[1]] = '+';
        int steps = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
			for (int i = 0; i < size; i++) {
				int[] rowCol = queue.poll();
                int row = rowCol[0];
                int col = rowCol[1];
				if (isValidRoom(row + 1, col, maze)) {
					queue.add(new int[]{row + 1, col});
				}
				if (isValidRoom(row - 1, col, maze)) {
					queue.add(new int[]{row - 1, col});
				}
                if (isValidRoom(row, col + 1, maze)) {
					queue.add(new int[]{row, col + 1});
				}
				if (isValidRoom(row, col - 1, maze)) {
					queue.add(new int[]{row, col - 1});
				}
                if ((row == 0 || row == maze.length - 1 || col == 0 || col == maze[0].length - 1) && (row != entrance[0] || col != entrance[1])){ 
                    return steps;
                }
			}
            steps++;
        }
        return -1;
    }
}