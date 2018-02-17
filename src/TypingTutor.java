import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	JFrame frame = new JFrame("Type or Die");
char currentLetter= generateRandomLetter();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	
	static int correctCounter=0;
	 static int count;
	static TypingTutor tt= new TypingTutor();
//--------------------------------
char generateRandomLetter() {
	Random r = new Random();
	return (char) (r.nextInt(26) + 'a');
}
public void Frame() {
	frame.setVisible(true);
	frame.setSize(400, 200);
	frame.add(panel);
	
label.setText(""+ currentLetter);
panel.add(label);
label.setFont(label.getFont().deriveFont(28.0f));
label.setHorizontalAlignment(JLabel.CENTER);

frame.addKeyListener(this);
frame.pack();	
}

public static void main(String[] args) {
	
	
	
tt.Frame();

	tt.generateRandomLetter();
	
	}


	

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub

	

}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("You typed" + " "+ currentLetter); 
	
	if(e.getKeyChar()==currentLetter) {
		System.out.println("Correct!");
		panel.setBackground(Color.GREEN);
		
	}
	else {
		System.out.println("incorrect");
		panel.setBackground(Color.RED);
	}
	count++;
	if(count>=10) {
		tt.showTypingSpeed(correctCounter);
		
		System.out.println("done");
	}

	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
	currentLetter= generateRandomLetter();
	label.setText(""+ currentLetter);
	correctCounter++;
	
}
private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
	Date timeAtEnd = new Date();
	long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
	long gameInSeconds = (gameDuration / 1000) % 60;
	double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
	int charactersPerMinute = (int) (charactersPerSecond * 60);
	JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
}
Date timeAtStart = new Date();

}
