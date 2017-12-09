import javax.swing.JOptionPane;

public class NetflixRunner {

	public static void main(String[] args) {
		
		Movie m1= new Movie("Frozen", 5);
		Movie m2= new Movie("Sound of Music", 4);
		Movie m3= new Movie("Mary Poppins", 4);
		Movie m4= new Movie("Shrek", 3);
		Movie m5= new Movie("Cars", 5);
		
		NetflixQueue nq=new NetflixQueue();
		
			nq.addMovie(m1);
			nq.addMovie(m2);
			nq.addMovie(m3);
			nq.addMovie(m4);
			nq.addMovie(m5);
		nq.printMovies();
//---------------___________-----------------------------------		
		JOptionPane.showMessageDialog(null, "the best movies are....");
		JOptionPane.showMessageDialog(null, "Cars, and Frozen!");
		
		JOptionPane.showMessageDialog(null, "the second best movies are ....The Sound of Music and Mary Poppins!");
	}
	
	
}
