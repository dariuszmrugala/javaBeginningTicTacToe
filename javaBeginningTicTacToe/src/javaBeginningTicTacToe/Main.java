package javaBeginningTicTacToe;

public class Main {

	public static void main(String[] args) {
		System.out.println("Tic Tac Toe\n");
		
		Board boardgame = new Board();
		boardgame.printBoard();
		
		LittleAi ai = new LittleAi();
		System.out.println("\nWho should run now?: ");
		System.out.println(ai.player(boardgame));
		
		System.out.println("\nHas O won? " + boardgame.hasPlayerWon(TictactoeSymbols.O));
		System.out.println("\nHas X won? " + boardgame.hasPlayerWon(TictactoeSymbols.X));
		
		TicTacToeFrameGui my_TicTacToeWindow = new TicTacToeFrameGui();
		my_TicTacToeWindow.setVisible(true);
		
	}
	


}
