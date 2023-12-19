package A23HX2PROG;
import robocode.*;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html

/**
 * LilleRobot4 - a robot by (your name here)
 */
public class LilleRobot4 extends JuniorRobot
{
	/**
	 * run: LilleRobot4's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// Some color codes: blue, yellow, black, white, red, pink, brown, grey, orange...
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc
		setColors(orange, white, black);

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(250);
			turnRight(90);
			ahead(250);
			turnRight(90);
			
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {
		// Replace the next line with any behavior you would like
		doNothing();
		bearGunTo(scannedBearing);
	fire(1);
		
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet() {
		// Replace the next line with any behavior you would like
back(100);
	
		
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like
		back(200);
	}	
}
