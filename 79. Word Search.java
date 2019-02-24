/*
79. Word Search
Given a 2D board and a word, find if the word exists in the grid.
The word can be constructed from letters of sequentially adjacent cell, 
where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

Example:
board =
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]
Given word = "ABCCED", return true.
Given word = "SEE", return true.
Given word = "ABCB", return false.
*/
class Solution {
	boolean[][] visited;

	public boolean exist(char[][] board, String word) {

		visited = new boolean[board.length][board[0].length];
		for (int i = 0; i < board.length; i++) {

			for (int j = 0; j < board[0].length; j++) {
				int index = 0;
				if (board[i][j] == word.charAt(index) && check(board, word, i, j, index))
					return true;
			}

		}
		return false;
	}

	boolean check(char[][] board, String word, int i, int j, int index) {

		if (index == word.length())
			return true;

		if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word.charAt(index)
				|| visited[i][j]) {
			return false;
		}

		visited[i][j] = true;

		if (check(board, word, i - 1, j, index + 1) || check(board, word, i + 1, j, index + 1)
				|| check(board, word, i, j - 1, index + 1) || check(board, word, i, j + 1, index + 1)) {
			return true;
		}

		visited[i][j] = false;
		return false;
	}
}
