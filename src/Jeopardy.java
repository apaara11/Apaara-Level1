
// Copyright Wintriss Technical Schools 2013
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.io.File;

/* This recipe is to be used with the Jeopardy Handout: http://bit.ly/1bvnvd4 */

public class Jeopardy implements ActionListener {
	private JButton firstButton;
	private JButton secondButton;
	private JButton thirdButton, fourthButton;

	private JPanel quizPanel;
	int score = 0;
	JLabel scoreBox = new JLabel("0");
	int buttonCount = 0;

	public static void main(String[] args) {
		new Jeopardy().start();
	}

	private void start() {
		JFrame frame = new JFrame();
		quizPanel = new JPanel();
		frame.setLayout(new BorderLayout());

		// 1. Make the frame show up
		frame.setVisible(true);
		// 2. Give your frame a title
		frame.setTitle("Jeopardy");
		// 3. Create a JPanel variable to hold the header using the createHeader
		// method
		JPanel panel = createHeader("The League");
		// 4. Add the header component to the quizPanel
		quizPanel.add(panel);
		// 5. Add the quizPanel to the frame
		frame.add(quizPanel);
		// 6. Use the createButton method to set the value of firstButton
		theLeagueButtons();
		// 10. Add the secondButton to the quizPanel
		
		// 11. Add action listeners to the buttons (2 lines of code)

		// 12. Fill in the actionPerformed() method below

		frame.pack();
		
		quizPanel.setLayout(new GridLayout(buttonCount + 1, 3));
		
		frame.add(makeScorePanel(), BorderLayout.NORTH);
		
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().height,
				
		Toolkit.getDefaultToolkit().getScreenSize().width);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

	public void theLeagueButtons() {
		firstButton = createButton("$100");

		quizPanel.add(firstButton);

		secondButton = createButton("$200");

		quizPanel.add(secondButton);

		thirdButton = createButton("$300");

		quizPanel.add(thirdButton);

		fourthButton = createButton("$400");

		quizPanel.add(fourthButton);
		
		
		firstButton.addActionListener(this);
		secondButton.addActionListener(this);
		thirdButton.addActionListener(this);
		fourthButton.addActionListener(this);
	}
	
	
	/*
	 * 13. Use the method provided to play the Jeopardy theme music
	 * 
	 * 14. Add buttons so that you have $200, $400, $600, $800 and $1000
	 * questions
	 *
	 * [optional] Use the showImage or playSound methods when the user answers a
	 * question
	 */

	private JButton createButton(String dollarAmount) {
		// Create a new JButton
		JButton button = new JButton(dollarAmount);
		// Set the text of the button to the dollarAmount

		// Increment the buttonCount (this should make the layout vertical)
		buttonCount = buttonCount + 1;
		// Return your new button instead of the temporary button

		return button;
	}

	public void actionPerformed(ActionEvent arg0) {
		// Remove this temporary message:
		JOptionPane.showMessageDialog(null, "pressed " + ((JButton) arg0.getSource()).getText() + " button");

		// Use the method that plays the jeopardy theme music.

		JButton buttonPressed = (JButton) arg0.getSource();
		
		playJeopardyTheme();
		// If the buttonPressed was the firstButton
if(buttonPressed.equals(firstButton)){
	
	askQuestion("How old is Mr. Vic ?", "83", 100);
	firstButton.setText("");
}

else if(buttonPressed.equals(secondButton)){
	
	askQuestion("How old is the League ?" , "10 years", 200);
	secondButton.setText("");
}

else if(buttonPressed.equals(thirdButton)){
	
	askQuestion("What is the name of Vic's wife?", "Diane", 300);
	thirdButton.setText("");
}

else if(buttonPressed.equals(fourthButton)){
	
	askQuestion("What is the last level?", "Level 9", 400);
	fourthButton.setText("");
	
}


	}

	private void askQuestion(String question, String correctAnswer, int prizeMoney) {
		// Remove this temporary message
		String answer = JOptionPane.showInputDialog(question);
		// Use a pop up to ask the user the question

		// If the answer is correct
		if(answer.equals(correctAnswer)){
			score+=prizeMoney;
			updateScore();
		JOptionPane.showMessageDialog(null, "You Are Correct");
}
		// Increase the score by the prizeMoney

		// Call the updateScore() method

		// Pop up a message to tell the user they were correct

		// Otherwise
		else{
			score-=prizeMoney;
			updateScore();
		JOptionPane.showMessageDialog(null, correctAnswer);
			
		}
		// Decrement the score by the prizeMoney

		// Pop up a message to tell the user the correct answer

		// Call the updateScore() method

	}
Clip clip;
	public void playJeopardyTheme() {
		try {
			if(clip!=null){
				clip.stop();
			}
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/jeopardy.wav"));
		    clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void playSound(String fileName) {
		AudioClip scream = JApplet.newAudioClip(getClass().getResource(fileName));
		scream.play();
	}

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		panel.setBackground(Color.CYAN);
		return panel;
	}

	private void updateScore() {
		scoreBox.setText("" + score);
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

	void showCorrectImage() {
		showImage("correct.jpg");
	}

	void showIncorrectImage() {
		showImage("incorrect.jpg");
	}

	private void showImage(String fileName) {
		JFrame frame = new JFrame();
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		frame.add(image);
		frame.setVisible(true);
		frame.pack();
	}
}
