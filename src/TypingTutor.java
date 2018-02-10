import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	JFrame frame = new JFrame("Type or Die");
char currentLetter= generateRandomLetter();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	
	

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
frame.add(label);
label.setFont(label.getFont().deriveFont(28.0f));
label.setHorizontalAlignment(JLabel.CENTER);

frame.addKeyListener(this);
	
}

public static void main(String[] args) {
	
	TypingTutor tt= new TypingTutor();
	
tt.Frame();
tt.generateRandomLetter();

	
	}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
