package javaBeginningTicTacToe;

public class LittleAi {
	
	public TictactoeSymbols player(Board boardgame) {
	    
		int count_of_X = 0;
	    int count_of_O = 0;
	    
	    for(int i = 0; i < 3 ; ++i) {
	    	for (int j = 0; j < 3; ++j) {
	    		if(boardgame.board[i][j] == TictactoeSymbols.X)
	    			count_of_X++;
	    		else if(boardgame.board[i][j] == TictactoeSymbols.O)
	    			count_of_O++;
	    	}
	    }
	    
	    if(count_of_X == count_of_O + 1)
	        return TictactoeSymbols.O;
	    else if(count_of_O == count_of_X + 1)
	        return TictactoeSymbols.X;
	    else
	    	return TictactoeSymbols.NULL;
	}
	
	
	public boolean terminal(Board boardgame) {
		return 	boardgame.hasPlayerWon(TictactoeSymbols.X) ||
				boardgame.hasPlayerWon(TictactoeSymbols.O);
	}
	
	//public minmax(boardgame){}
	//main point of the LittleAi. Return optimal action for current player!

	//public actions(boardgame){}
	//return all posible action for given boardgame
	
	//public result(boardgame, action){}
	//applay action on boardgame
	
}
