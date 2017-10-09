import java.net.URI;

import javax.swing.JButton;

public class TVCutness {
	
	JButton ducks = new JButton("ducks");
	JButton frog = new JButton("frogs");
	JButton unicorn = new JButton("pink fluffy unicorns");
	
	public static void main(String[] args) {

		
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
			URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
