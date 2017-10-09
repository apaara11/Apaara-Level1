import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {

		JButton button1 = new JButton("joke");
		JButton button2 = new JButton("punchline");
		
	public static void main(String[] args) {
		
		ChuckleClicker clicker = new ChuckleClicker();
		
			clicker.makeButtons();
		
		
	}
	
	public void makeButtons() {
		
		JPanel panel = new JPanel(); 
		
		JFrame frame = new JFrame();
			
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			frame.setVisible(true);
			frame.add(panel);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
			panel.add(button1);
			panel.add(button2);
			
			frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==button1) {
	JOptionPane.showMessageDialog(null, "What is black and white and read all over?");
		}
		
		else if(e.getSource()==button2) {
	JOptionPane.showMessageDialog(null, "What is a newspaper.");		
		}
	}
}
