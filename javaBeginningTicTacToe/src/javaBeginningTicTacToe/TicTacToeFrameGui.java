package javaBeginningTicTacToe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TicTacToeFrameGui {

	public JFrame ticTacToeFrame = new JFrame("Tic Tac Toe");
	
	public TicTacToeFrameGui() {
		ticTacToeFrame.setSize(400,400);
		
		JButton ticTacToeButtons[][] = new JButton[3][3];
		
		for (int yy = 0 ; yy < 3; ++yy) {
			for (int xx = 0 ; xx < 3 ; ++xx) {
				ticTacToeButtons[yy][xx] = new JButton();
				ticTacToeButtons[yy][xx].setBounds(xx*100, yy*100, 100, 100);
				ticTacToeButtons[yy][xx].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						JButton tmpButton = (JButton) e.getSource();
						ticTacToeButtons[tmpButton.getLocation().y/100][tmpButton.getLocation().x/100].setText("x");
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
	
}
