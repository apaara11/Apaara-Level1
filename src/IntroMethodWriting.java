import javax.swing.JOptionPane;

public class IntroMethodWriting {
public static void main(String[] args) {
		iRock();	
		Rocker("Kaur");
		Truth("Selena Gomez");
		Echo("echo");
		TripleEcho("something", 3);
		int sum = Add(4,8); 
		System.out.println(sum);
}
public static void iRock() {
	System.out.println("Apaara Chawla Rocks!");
}
public static void Rocker(String name){
System.out.println(name+ " Rocks");
}
public static void Truth(String name) {
	if(name.equals("Justin Bieber")) {
		JOptionPane.showMessageDialog(null, "is annoying");
	}
	else if(name.equals("Selena Gomez")) {
		JOptionPane.showMessageDialog(null, "is AWESOME");
	}
	else {
		JOptionPane.showMessageDialog(null, "is okay");
	}
}

public static void Echo(String message){
	for (int i = 0; i < 2; i++) {
		System.out.println(message);
	}
}
public static void TripleEcho(String message, int number) {
	for (int z = 0; z < number; z++) {
		System.out.println(message);
	}
}
public static int Add(int num1, int num2) {
	return num1+num2;
	
}
}
