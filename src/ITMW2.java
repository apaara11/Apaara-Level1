import javax.swing.JOptionPane;

public class ITMW2 {
	public static void main(String[] args) {
		
		String friend= JOptionPane.showInputDialog("Find out what each friend wants for Christmas. Ella, Baya, and Jeevan"); 
		String gift= whichPresent("Ella") ;whichPresent(friend);
		String gift1= whichPresent("Baya"); whichPresent(friend);
		String gift2= whichPresent("Jeevan"); whichPresent(friend);
		System.out.println(gift);System.out.println(gift1);System.out.println(gift2);
//-----------------------------------------------------------------------------------
	doPigsEat("quesidias");
	System.out.println(doPigsEat("quesidillas"));
	}
	public static String whichPresent(String friendname) {
		if(friendname.equals("Ella")) {
			return "Ella Wants a PUPPY";
		}
		else if(friendname.equals("Baya")) {
			return "Baya wants a sweater";
		}
		else if(friendname.equals("Jeevan")) {
			return "Jeevan wants a basketball";
		}
		else {
			return "	IDK";
		}
	}
	public static boolean doPigsEat(String food) {
		if (food.equals("bananas")) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int getLuckyNumber() {
		
	}
}
