import java.util.Random;

import javax.swing.JFrame;

public class WhackAMole {
	JFrame frame = new JFrame();
	
	public static void main(String[] args) {
	
		WhackAMole whackamole = new WhackAMole();
	whackamole.drawButtons();
	
	}
	public void drawButtons() {
		int r = new Random().nextInt(24);
	}
}
