import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TVCuteness implements ActionListener {

	JButton ducks = new JButton("ducks");
	JButton frog = new JButton("frogs");
	JButton unicorn = new JButton("pink fluffy unicorns");

	public static void main(String[] args) {

		TVCuteness clicker = new TVCuteness();
		
			clicker.buttonStuff();
	}

	public void buttonStuff() {

		JPanel panel = new JPanel();

		JFrame frame = new JFrame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
		frame.add(panel);

		ducks.addActionListener(this);
		frog.addActionListener(this);
		unicorn.addActionListener(this);

		panel.add(ducks);
		panel.add(frog);
		panel.add(unicorn);

		frame.pack();
	}

	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}

	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI("https://www.youtube.com/watch?v=" + videoID);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == ducks) {

			showDucks();
		} else if (e.getSource() == frog) {

			showFrog();
		} else if (e.getSource() == unicorn) {

			showFluffyUnicorns();
		}
	}

}
