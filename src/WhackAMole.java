import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener{
	JButton mole= new JButton("mole");
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	public static void main(String[] args) {
		WhackAMole whackamole = new WhackAMole();
	int r = new Random().nextInt(24);
	whackamole.drawButtons(r);
	
	
	}
	public void drawButtons(int random) {
	mole.addActionListener(this);
		frame.setVisible(true);
		frame.setSize(400, 200);
		frame.add(panel);
		for (int i = 0; i < 25; i++) {
			if(i==random) {
				panel.add(mole);
			}
			else {
				JButton button= new JButton();
					button.addActionListener(this);
				panel.add(button);
			}
		}
	}
	void speak(String words) {
		try {
		Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()!=mole) {
			speak("dork");
		}
		else {
			
		}
	}
}
