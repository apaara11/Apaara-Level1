import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonListeners implements ActionListener {
	public static void main(String[] args) {
		ButtonListeners bl = new ButtonListeners();
	}
	
	ButtonListeners(){
	JFrame frame = new JFrame();
	JButton button = new JButton("Please press me");
	
	frame.add(button);
	frame.setVisible(true);
	frame.pack();
	
	button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Thank you for pressing me!");
	}
}