package A23HX2PROG;
import robocode.*;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html

/**
 * TheChosenOne - a robot by LWT
 */
public class TheChosenOne extends JuniorRobot
{
	/**
	 * run: TheChosenOne's default behavior
	 */
	public void run() {
		setColors(yellow, black, white, red, black);

		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(100);
			turnGunRight(360); 
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {
	turnGunTo(scannedAngle);
		fire(3);

	}


	public void onHitByBullet() {
		
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like
		turnBackLeft(20,45);
	}	
}
