import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {

	JButton button = new JButton();
	public static void main(String[] args) {
		
		 FortuneCookie fortuneCookie = new FortuneCookie();
		 	fortuneCookie.showButton();
	}
	
	public void showButton() {
		
		JFrame frame = new JFrame(); 
		
			frame.setVisible(true);
			frame.add(button);
			
		button.addActionListener(this);
		
		System.out.println(" ");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==button) {
			
			JOptionPane.showMessageDialog(null, "WOOHOO!!");
			
Random random = new Random();
		int r1 = random.nextInt(5);	
			
				if( r1==0) {
					JOptionPane.showMessageDialog(null, "You are going to die in seven days-sorry :( ");
				}
				else if (r1==1) {
					JOptionPane.showMessageDialog(null, "I do not know");
				}
				else if (r1==2) {
					JOptionPane.showMessageDialog(null, "You woill be successful!!");
				}
		}
		
	}
}
