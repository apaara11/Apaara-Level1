import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GetLatestTweet implements ActionListener {

	JButton button = new JButton();
	
	TextField textfield = new TextField();
//-------------------------------------------
	public static void main(String[] args) {
		
		GetLatestTweet gltweet = new GetLatestTweet();
		
		gltweet.makeStuff();
	}
	
	public void makeStuff() {
		
JFrame frame = new JFrame(); 
		
		frame.setSize(1441,1441);
		
			frame.setVisible(true);
			frame.add(button);
			frame.add(textfield);

JPanel panel  = new JPanel();

panel.setVisible(true);
panel.add(button);
panel.add(textfield);

	frame.add(panel);
	
			button.addActionListener(this);
			textfield.addActionListener(this);
			
	frame.pack();
	
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
