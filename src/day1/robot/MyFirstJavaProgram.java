package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
boolean m = true;
	Robot DVA = new Robot();
	
	
	while (m == true) {
	
	/*DVA.setSpeed(5);
	DVA.sparkle();
	DVA.move(500);
	DVA.turn(180);
	DVA.move(920);
	DVA.getX();
	DVA.getY();
	DVA.turn(180);
	DVA.move(500);
	DVA.*/
	for (int i = 3; ;i++) {
		
		DVA.penDown();
		DVA.setSpeed(1 + i);
		DVA.move(300);
		DVA.turn(90);
		
	}
	
	}
		
	}

	private static int random(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
