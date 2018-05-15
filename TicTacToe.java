// Wanghao Ying
// May 1st, 2018

		
		import java.util.Scanner;
		public class TicTacToe {

		    public static void printBoard(char[][] board) {
		   	 int rows = board.length;
		   	 int cols = board[0].length;
		   	 
		   	 for(int i = 0; i<rows; i++) {
		   		 for(int j = 0; j<cols; j++) {
		   			 System.out.print(board[i][j]+" ");
		   		 }
		   		 System.out.println();
		   	 }
		    }
		    
		    public static char [][] initBoard(char[][]board) {
		   	 int rows= board.length;
		   	 int cols = board[0].length;
		   	 
		   	 for(int i = 0; i<rows; i++) {
		   		 for(int j=0; j<cols; j++) {
		   			 board[i][j] = '-';
		   		 }
		   	 }
		   	 return board;
		    }
		    
		    public static void main(String[] args) {
		   	 Scanner scnr = new Scanner(System.in);
		   	 final int BOARD_SIZE=3;
		   	 int playerTurn = 1;
		   	 boolean gameOver= false;
		   	 int userRow=0;
		   	 int userCol = 0;
		   	 
		   	 char [][] gameBoard= new char[BOARD_SIZE][BOARD_SIZE];
		   	 
		   	 gameBoard =initBoard(gameBoard);
		   	 printBoard(gameBoard);
		   	 
		   	 while(gameOver==false) {



		   	 }	 
		    }

		

	}


