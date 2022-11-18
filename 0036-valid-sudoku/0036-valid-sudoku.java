class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<String, Set<Character>> grids = new HashMap<>();

        for(int row=0; row<board.length; row++) {
            for(int col=0; col < board[0].length; col++) {
                if(board[row][col]=='.') {
                    continue;
                }

                // row check
                if(rows.containsKey(row) && rows.get(row).contains(board[row][col])) {
                    return false;
                } else {
                    rows.putIfAbsent(row, new HashSet<>());
                    rows.get(row).add(board[row][col]);
                }

                // col check
                if(cols.containsKey(col) && cols.get(col).contains(board[row][col])) {
                    return false;
                } else {
                    cols.putIfAbsent(col, new HashSet<>());
                    cols.get(col).add(board[row][col]);
                }

                // 3x3 grid check
                String gridId = row/3 + "" + col/3;
                if(grids.containsKey(gridId) && grids.get(gridId).contains(board[row][col])) {
                    return false;
                } else {
                    grids.putIfAbsent(gridId, new HashSet<>());
                    grids.get(gridId).add(board[row][col]);
                }
            }
        }
        
        return true;
    }
}