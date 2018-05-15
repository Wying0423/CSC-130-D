/*
 * Wanghao Ying
 */

public class SequentialPlayer extends Player {
	public SequentialPlayer() {
    		myName = "Sequential";
	}

	public int ai(GameBoard gb) {
		int[][] board = gb.getBoard();
		int columPlacement = -1;
		for (int i = 0; i < board[0].length; i++) {
			if(gb.isLegalMove(i) == true) {
				columPlacement = i;
				break;
			}
		}
		return columPlacement;
	}
}


