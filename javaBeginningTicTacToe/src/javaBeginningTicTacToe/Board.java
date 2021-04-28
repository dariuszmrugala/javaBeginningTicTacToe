package javaBeginningTicTacToe;

public class Board {
	public TictactoeSymbols board [][] = 
		{	{TictactoeSymbols.X,TictactoeSymbols.O,TictactoeSymbols.O}, 
			{TictactoeSymbols.X,TictactoeSymbols.X,TictactoeSymbols.NULL},
			{TictactoeSymbols.O,TictactoeSymbols.NULL,TictactoeSymbols.X}};;
	
	private char verticalLimiter = '|';
	
			
	public Board() {
//		board = 
	}
	
	public void printBoard() {
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				if(board[i][j] == TictactoeSymbols.NULL) {
					System.out.print(" ");
					if(j < 2)
						System.out.print(verticalLimiter);
				} else if (board[i][j] == TictactoeSymbols.O) {
					System.out.print("O");
					if(j < 2)
						System.out.print(verticalLimiter);
				} else if (board[i][j] == TictactoeSymbols.X) {
					System.out.print("X");
					if(j < 2)
						System.out.print(verticalLimiter);
				} else {
					System.out.println("here should be exception, but I don't know them yet");
				}
			}
			System.out.println("");
			System.out.println("-+-+-");
			
		}
	}
	
	public boolean hasPlayerWon(TictactoeSymbols whichPlayer) {
		if(whichPlayer == TictactoeSymbols.NULL)
				System.out.println("There is no NULL player :P. Exeptions should be thrown?");
		
		if(
			board[0][0] == whichPlayer	&& board[0][1] == whichPlayer && board[0][2] == whichPlayer ||
			board[1][0] == whichPlayer	&& board[1][1] == whichPlayer && board[1][2] == whichPlayer ||
			board[2][0] == whichPlayer	&& board[2][1] == whichPlayer && board[2][2] == whichPlayer ||
			
			board[0][0] == whichPlayer	&& board[1][0] == whichPlayer && board[2][0] == whichPlayer ||
			board[0][1] == whichPlayer	&& board[1][1] == whichPlayer && board[2][1] == whichPlayer ||
			board[0][2] == whichPlayer	&& board[1][2] == whichPlayer && board[2][2] == whichPlayer ||
			
			board[0][0] == whichPlayer	&& board[1][1] == whichPlayer && board[2][2] == whichPlayer ||
			board[2][0] == whichPlayer	&& board[1][1] == whichPlayer && board[0][2] == whichPlayer
				) {
			return true;
		}
		
		return false;
		
	}
	
}
