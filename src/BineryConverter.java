import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BineryConverter {

	JButton button= new JButton("convert");
	JTextField textfield= new JTextField();
	JTextField textfield2= new JTextField();
	
	public static void main(String[] args) {
		
		 BineryConverter bc = new BineryConverter();
		 
		 bc.stuff();
		
	}
	
	public void stuff() {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
frame.setVisible(true);
frame.setSize(400, 59);
frame.add(panel);

//textfield.setSize(200, 20);
//textfield2.setSize(200, 20);
	panel.add(textfield);
	panel.add(button);
	panel.add(textfield2);
	}
	
	int convertToInt(String binary) {
		if(binary.length() != 8){
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return 0;
		}
		 if(!Pattern.matches("\2", binary)) {
			 JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
				return 0;
		 }
		try {
			int asciiValue = Integer.parseInt(binary, 2);
			return asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			//question.setText("");
			return 0;
		}
	}
 String convertToString(String binary) {
   	 int asciiValue = Integer.parseInt(binary, 2);
   	 char theLetter = (char) asciiValue;
   	 return "" + theLetter;
    }

	
	
}
