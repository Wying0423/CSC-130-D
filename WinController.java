/*
 * WinController.java
 * Author: Wanghao Ying
 * 
 * This object's job is to decide
 * if there is a winning configuration 
 * (four in a row) on the board.
 */
public class WinController {
	GameBoard myGameBoard;
	
	public WinController(GameBoard game) {
		myGameBoard = game;
	}

	/* TODO!
	 * Checks horizontal, vertical, and diagonal directions for 
	 * four like checkers in a row. Return true is winner is 
	 * found, otherwise return false.
	 */
	//HORIZONTAL WIN 
	
	// if change the int number i and j into rows and columns may help to understand the problem better 
	
	// horizontal checking
	public boolean hasWinner() {
		int[][] board = myGameBoard.getBoard();
		for (int row = 0; row <board.length; row++) {
			for(int col = 0; col <board[0].length -3; col++) {
				if (board [row][col] == GameBoard.RED && board[row][col +1] == GameBoard.RED && board[row][col + 2] == GameBoard.RED && board[row][col + 3] == GameBoard.RED) {
					return true;
				}if (board [row][col] == GameBoard.BLACK && board[row][col +1] == GameBoard.BLACK && board[row][col + 2] == GameBoard.BLACK && board[row][col + 3] == GameBoard.BLACK) {
					return true;
				}
			}
		}
	//Vertical checking
		for (int row = 0; row <board.length -3; row++) {
			for(int col = 0; col <board[0].length; col++) {
				if (board [row][col] == GameBoard.RED && board[row +1][col] == GameBoard.RED && board[row + 2][col] == GameBoard.RED && board[row + 3][col] == GameBoard.RED) {
					return true;
			}
				if (board [row][col] == GameBoard.BLACK && board[row + 1][col] == GameBoard.BLACK && board[row + 2][col] == GameBoard.BLACK && board[row + 3][col] == GameBoard.BLACK) {
					return true;
				}
			}
		}
		//diagonal checking, the \ diagonal line checking for marks.
		for (int row = 0; row <board.length -3; row++) {
			for(int col = 0; col <board[0].length -3; col++) {
				if (board [row][col] == GameBoard.RED && board[row +1][col +1] == GameBoard.RED && board[row + 2][col +2] == GameBoard.RED && board[row + 3][col +3] == GameBoard.RED) {
					return true;
				}
				if (board [row][col] == GameBoard.BLACK && board[row + 1][col +1] == GameBoard.BLACK && board[row + 2][col +2] == GameBoard.BLACK && board[row + 3][col +3] == GameBoard.BLACK) {
					return true;
				}
			}
		}
		//other diagonal, the / diagonal line checking for marks. 
		for (int row = 0; row <board.length -3; row++) {
			for(int col = board[0].length -1; col > 2; col--) {
				if (board [row][col] == GameBoard.RED && board[row +1][col -1] == GameBoard.RED && board[row + 2][col -2] == GameBoard.RED && board[row + 3][col -3] == GameBoard.RED) {
					return true;
				}
				if (board [row][col] == GameBoard.BLACK && board[row + 1][col -1] == GameBoard.BLACK && board[row +2][col -2] == GameBoard.BLACK && board[row + 3][col -3] == GameBoard.BLACK) {
					return true;
				}
			}
		}
		return false;
	}
}

	
