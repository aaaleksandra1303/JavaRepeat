package TicTacToe;
import java.awt.EventQueue;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	public MyFrame(){
		setSize(300, 300);
		setTitle("TicTacToe");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		
		

	}
	public static void main(String[] args) {

			EventQueue.invokeLater(new Runnable(){
				@Override
				public void run(){
					new MyFrame();
				}
			});

	}

	


}
