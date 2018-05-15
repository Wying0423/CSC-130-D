import java.util.Random;
/*
 * Author : Wanghao Ying
 */

public class WanghaoPlayer extends Player{
	public WanghaoPlayer() {
    		myName = "Wying";
	}
	
	int move = 0;
		
		public int ai(GameBoard gb) {
			
			// if there is a winner for next checker input.
			for(int col=0;col<gb.getBoard().length;col++) { //loop through every col to see if winner in cloned board
				GameBoard gbCopy = gb.clone();
				
				//make move
				if(gbCopy.isLegalMove(col)==true) {
					gbCopy.drop(col, myColor); // drop a checker of your color into the GameBoard copy.
				} 
				
				if(hasWinner(gbCopy)==true) { //check if move wins
				return col; // which column your dropped will win.  
				}
			}
			
			// if there is no winner so far
			//if(hasWinner(gb)==false) {
				
			//}
			
			move = move +1;
			switch (move) {
	        case 1:
	        	if(gb.isLegalMove(5)) {
	         	   return 5;
	            }
	           break;


	        case 3:
	        	if(gb.isLegalMove(1)) {
	         	   return 1;
	            }
	       
	           break;

	        case 4:
	        	if(gb.isLegalMove(6)) {
	         	   return 1;
	            }

	           break;
	        case 5:
	        	if(gb.isLegalMove(1)) {
	         	   return 1;
	            }

	           break;
	        case 6:
	        	if(gb.isLegalMove(1)) {
	         	   return 1;
	            }

	           break;
	        case 7:
	        	if(gb.isLegalMove(1)) {
	         	   return 1;
	            }

	           break;
	           
			default:
			move = (int)(Math.random()*6);
			if (gb.isLegalMove(move)); {
				break;
			}
		}
			return move + 1;
	}
		public boolean hasWinner(GameBoard myGameBoard) {
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