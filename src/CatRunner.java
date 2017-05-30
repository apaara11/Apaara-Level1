
public class CatRunner {

	public static void main(String[] args) {
		/* Do the following things without changing the Cat class */

		// 1. Make the Cat meow
		Cat Whiskers = new Cat("whiskers");
		Whiskers.meow();
		
		// 2. Get the Cat to print it's name
		Whiskers.printName();
		
		// 3. Kill the Cat!
		for (int i = 9; i > 0; i--) {
			Whiskers.kill();
		}
	}
}