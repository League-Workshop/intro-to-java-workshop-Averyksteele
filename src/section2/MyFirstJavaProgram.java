package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		Robot Robby = new Robot();
		Robby.penDown();
		for (int i = 0; i < 100; i++) {
			Robby.setSpeed(100);
		Robby.setPenColor(Color.PINK);
		Robby.move(100);
		Robby.turn(80);
		Robby.move(100);
		Robby.turn(70);
		Robby.move(200);
		}
	}

	private static void setSpeed(int i) {
		// TODO Auto-generated method stub

	}
}
