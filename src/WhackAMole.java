 import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JButton mole = new JButton("mole");
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	static Date timeAtStart;
	static int molesWhacked;
	static int fails;

	public static void main(String[] args) {
		timeAtStart = new Date();

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
			if (i == random) {
				panel.add(mole);
			} else {
				JButton button = new JButton();
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
		if (e.getSource() != mole) {
			speak("dork");
			fails++;
		} else if (e.getSource() == mole) {
			speak("awesome sauce");
			playSound("HappyWAM.wav");

			frame.dispose();
			WhackAMole whackamole = new WhackAMole();
			int r = new Random().nextInt(24);
			whackamole.drawButtons(r);

			endGame(timeAtStart, molesWhacked);
			molesWhacked++;
			System.out.println(molesWhacked + " " + timeAtStart);
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		if (molesWhacked == 10) {

			System.out.println(molesWhacked);
			JOptionPane.showMessageDialog(null, "Your whack rate is "
					+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
		}

		if (fails == 2) {
			speak("idiot");
		} else if (fails == 3) {
			speak("moron");
		} else if (fails == 4) {
			speak("you're a complete waste of atoms");
		}
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
