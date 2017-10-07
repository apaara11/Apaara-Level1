// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
	public static void main(String[] args) {
		
	// 1. Make a main method that includes all the steps below….
						//DONE\\
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
			
		int number = new Random().nextInt(4);
	// 3. Print out this variable

		System.out.println(number);
	// 4. Get the user to enter a question for the 8 ball

	String answer = JOptionPane.showInputDialog("Please ask a question");
		// 5. If the random number is 0
	if(number==0) {
		JOptionPane.showMessageDialog(null," YES!");
	}
	// -- tell the user "Yes"

	// 6. If the random number is 1
	else if(number==1){
		JOptionPane.showMessageDialog(null, "No");
	}

	// -- tell the user "No"

	// 7. If the random number is 2
	else if(number==2) {
		JOptionPane.showMessageDialog(null, "Maybe? You should ask google");
	}
	

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	else if(number==3) {
		JOptionPane.showMessageDialog(null, "I don't know.");
	}
	
	// -- write your own answer

}
}



