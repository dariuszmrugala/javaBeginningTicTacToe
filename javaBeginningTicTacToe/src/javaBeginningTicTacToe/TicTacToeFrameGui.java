package javaBeginningTicTacToe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TicTacToeFrameGui {

	public JFrame ticTacToeFrame = new JFrame("Tic Tac Toe");
    public JButton ticTacToeButtons[][] = new JButton[3][3];
	
	public TicTacToeFrameGui(Board board) {
		ticTacToeFrame.setSize(400,400);
		
		
		for (int yy = 0 ; yy < 3; ++yy) {
			for (int xx = 0 ; xx < 3 ; ++xx) {
				ticTacToeButtons[yy][xx] = new JButton();
				ticTacToeButtons[yy][xx].setBounds(xx*100, yy*100, 100, 100);
				ticTacToeButtons[yy][xx].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						JButton tmpButton = (JButton) e.getSource();
//						LittleAi ai = new LittleAi();
//						System.out.println("\nWho should run now?: ");
//						System.out.println(ai.player(board));
//						if(ai.player(board) == TictactoeSymbols.X)
							ticTacToeButtons[tmpButton.getLocation().y/100][tmpButton.getLocation().x/100].setText("X");
//						else if (ai.player(board) == TictactoeSymbols.O)
//							ticTacToeButtons[tmpButton.getLocation().y/100][tmpButton.getLocation().x/100].setText("O");
					}
				});
			}
		}
		
		ticTacToeFrame.setLayout(null);
	
		for (int i = 0 ; i < 3; ++i) {
			for (int j = 0 ; j < 3 ; ++j) {
				ticTacToeFrame.add( ticTacToeButtons[i][j]);
			}
		}
	}
	
	public void setVisible(boolean show) {
		ticTacToeFrame.setVisible(show);	
	}
	
	public void setButton(int i, int j, TictactoeSymbols symbol) {
		ticTacToeButtons[i][j].setText(symbol.toString());
	}
	
	public void setBoard(Board board) {
		for (int i = 0 ; i < 3; ++i) {
			for (int j = 0 ; j < 3 ; ++j) {
				if(board.board[i][j] == TictactoeSymbols.X ) {
					setButton(i, j, TictactoeSymbols.X);			
				} else if (board.board[i][j] == TictactoeSymbols.O) {
					setButton(i, j, TictactoeSymbols.O);
				}
			}
		}
	}
	
}
