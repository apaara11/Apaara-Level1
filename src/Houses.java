import java.util.Random;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class Houses {
	
	static Random r = new Random();
	
	public static void main(String[] args) {
		Tortoise.setX(10);
		Tortoise.setY(400);
		
		Tortoise.setPenWidth(5);
		Tortoise.penDown();
		Tortoise.setSpeed(10);
		
		Tortoise.show();


		// 1. have the tortoise start in the bottom left corner

		// 2. draw a house of height 100 with grass after it. This shape: |**|_
drawHouse();
		// 3. extract the piece of code that draws the house into a method. Draw
		// 10 houses.

		// 4. Change the method to take int height as a parameter. Draw 9 houses
		// of different heights

		// 5. Make the method take a String instead of a height.

		// “small” 60
		// “medium” 120
		// “large” 250

		// 6. Make the method take a color as well as a height. The houses are
		// drawn in that color.

		// [optional] Set the scene to night time by setting the background to
		// black using Tortoise.getBackgroundWindow().setColor

		// 7. Give the houses peaked roofs

		// 8. Extract that roof code into a method “drawPointyRoof” and create a
		// new method: “drawFlatRoof”.

		// 9. make large houses have flat rooves*/

	}
	
	public static void drawHouse() {

int height = r.nextInt(201)+50;
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
	}
}
