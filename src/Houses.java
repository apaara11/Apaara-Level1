import java.util.Random;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class Houses {

	static Random r = new Random();

	public static void main(String[] args) {
		Tortoise.setX(11);
		Tortoise.setY(400);

		Tortoise.setPenWidth(5);
		Tortoise.penDown();
		Tortoise.setSpeed(10);

		Tortoise.show();

		for (int i = 0; i < 12; i++) {
			int roof = r.nextInt(2);

			if (roof == 1) {
				pointyHouse();
			} else {
				flatHouse();
			}
		}
	}

	public static void pointyHouse() {

		int height = r.nextInt(201) + 50;
		Tortoise.setPenColor(PenColors.getRandomColor());

		Tortoise.move(height);
		Tortoise.turn(45);
		Tortoise.move(25);
		Tortoise.turn(90);
		Tortoise.move(25);
		Tortoise.turn(45);
		Tortoise.move(height);

		Tortoise.turn(-90);
		Tortoise.setPenColor(Colors.Greens.DarkGreen);
		Tortoise.move(20);
		Tortoise.turn(-90);
	}

	public static void flatHouse() {
		int height = r.nextInt(201) + 50;
		Tortoise.setPenColor(PenColors.getRandomColor());

		Tortoise.move(height);
		Tortoise.turn(90);
		Tortoise.move(25);
		Tortoise.turn(90);
		Tortoise.move(height);

		Tortoise.turn(-90);
		Tortoise.setPenColor(Colors.Greens.DarkGreen);
		Tortoise.move(20);
		Tortoise.turn(-90);
	}
}
