import java.awt.Dimension;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class GetLatestTweet implements ActionListener {

	JButton button = new JButton();
	
	TextField textfield = new TextField();
	
//-------------------------------------------
	public static void main(String[] args) {
		
		GetLatestTweet gltweet = new GetLatestTweet();
		
		gltweet.makeStuff();
	}
	
	public void makeStuff() {
		
JFrame frame = new JFrame(); 
		
button.setText("Search the Twitterverse");
textfield.setText("yolo");
textfield.setPreferredSize(new Dimension(200,20));

		frame.setSize(1441,1441);
		
			frame.setVisible(true);
			
			

JPanel panel  = new JPanel();

panel.setVisible(true);
panel.add(button);
panel.add(textfield);



	frame.add(panel);
	
			button.addActionListener(this);
			textfield.addActionListener(this);
			
	frame.pack();
		
	}
	private String getLatestTweet(String searchingFor) {

		Twitter twitter = new TwitterFactory().getInstance();
		AccessToken accessToken = new AccessToken(
				"2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
				"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
		twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
				"6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
		twitter.setOAuthAccessToken(accessToken);

		Query query = new Query(searchingFor);
		try {
			QueryResult result = twitter.search(query);
			return result.getTweets().get(0).getText();
		} catch (Exception e) {
			System.err.print(e.getMessage());
			return "What the heck is that?";
		}
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==button) {
			JOptionPane.showMessageDialog(null, "tweet, tweet");
			
			
			System.out.println((getLatestTweet(textfield.getText())));
			}
		
	}
}
