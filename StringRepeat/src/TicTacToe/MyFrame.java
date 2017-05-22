package TicTacToe;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	int counter =0;
	public MyFrame(){
		setSize(500, 500);
		setTitle("TicTacToe");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 3)); 
		//create 9 buttons
		for(int i=1;i<=9;i++){
			JButton button = new JButton(""); 
			add(button); // add buttons to myFrame
			button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton button=(JButton)e.getSource(); //get source
					if(counter%2==0){
					System.out.println("X");
					button.setText("X");
					}else{
						System.out.println("O");
						button.setText("0");
					}
					button.setEnabled(false);//only one click in each button
					counter++;
				}
			});
		}
		
		//pack();
		
		

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
