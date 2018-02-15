package extra;

import org.jointheleague.graphical.robot.Robot;

public class ValentinesDay {
public static void main(String[] args) {
	Robot r22 = new Robot("batman");
	Robot r2 = new Robot("batman");
	r2.setWindowImage("POKEMON.png");
	r2.setWindowColor(135, 206, 250);
	r2.setPenColor(0, 0, 0);
	r22.setPenColor(0, 0, 0);
	r2.penDown();
	r22.penDown();
	r2.setSpeed(1000000000);
	r22.setSpeed(100000000);
	r2.setAngle(0);
	r22.setAngle(0);
	r2.miniaturize();
	r22.miniaturize();
	for (int i = 0; i < 181; i++) {
	r22.move(1);
	r22.turn(1);
	r2.move(1);
	r2.turn(-1);
	}
	r2.setAngle(160);
	r22.setAngle(-160);
	r2.move(330);
	r22.move(330);
	
	
	
	
	
}
}
