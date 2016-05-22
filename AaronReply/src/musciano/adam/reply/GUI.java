package musciano.adam.reply;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GUI {
	public static enum ButtonId{
		ID_NONE,
		ID_CONTINUE
	};
	private JFrame frame;
	private JButton btnContinue;
	private boolean buttonClicked = false;
	private ButtonId buttonId= ButtonId.ID_NONE;

	
	
	public GUI(){
		setUp();
		System.out.println(buttonId);
	}
	
	private void setUp(){
		
		frame= new JFrame("Hello Aaron!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		
		
		btnContinue= new JButton();
		btnContinue.setSize(30,50);
		btnContinue.setText("Continue");
		btnContinue.addActionListener(new AL());
		
		
		frame.add(btnContinue);
		frame.setSize(350,200);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);	
		
	}
	
	public ButtonId getButton(){
		ButtonId temp= buttonId;
		reset();
		return temp;	
	}
	public boolean isButtonClicked(){return buttonClicked;}
	public void reset(){
		buttonId = buttonId.ID_NONE;
		buttonClicked = false;
		frame.setVisible(true);
	}
	
	private class AL implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource().equals(btnContinue)){
				frame.setVisible(false);
				buttonClicked = true;
				buttonId = buttonId.ID_CONTINUE;
				System.out.println(buttonId);
			}/*else if(e.getSource().equals(btn2)){
				frame.setVisible(false);
				buttonClicked = true;
				button = '2';
			}else if(e.getSource().equals(btn3)){
				frame.setVisible(false);
				buttonClicked = true;
				button = '4';
			}else if(e.getSource().equals(btn4)){
				frame.setVisible(false);
				buttonClicked = true;
				button = 'S';
			}*/
		}
	}
}
