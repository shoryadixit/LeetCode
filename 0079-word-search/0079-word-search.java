class Solution {
    public boolean exist(char[][] board, String word) {
    if (board == null || word == null) return false;
    if (word.length() == 0) return true;
    if (board.length == 0) return false;
    int rows = board.length;
    int cols = board[0].length;
    for (int r = 0; r < rows; r++) {
      for (int c = 0; c < cols; c++) {
        // scan board, start with word first character 
        if (board[r][c] == word.charAt(0)) {
          if (helper(board, word, r, c, 0)) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  private boolean helper(char[][] board, String word, int r, int c, int start) {
    // already match word all characters, return true
    if (start == word.length()) return true;
    if (!isValid(board, r, c) ||
        board[r][c] != word.charAt(start)) return false;
    // mark visited
    board[r][c] = '*';
    boolean res = helper(board, word, r + 1, c, start + 1)
        ||  helper(board, word, r, c + 1, start + 1)
        ||  helper(board, word, r - 1, c, start + 1)
        ||  helper(board, word, r, c - 1, start + 1);
    // backtracking to start position
    board[r][c] = word.charAt(start);
    return res;
  }
  
  private boolean isValid(char[][] board, int r, int c) {
    return r >= 0 && r < board.length && c >= 0 && c < board[0].length;
  }
}