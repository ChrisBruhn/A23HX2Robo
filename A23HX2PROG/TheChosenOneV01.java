package A23HX2PROG;
import robocode.*;


public class TheChosenOneV01 extends JuniorRobot
{
	/**
	 * run: TheChosenOne's default behavior
	 */
	public void run() {
		setColors(yellow, black, white, red, black);

		while(true) {
			// Replace the next 4 lines with any behavior you would like
			
			if((robotY == fieldHeight) || (robotY == 0){
			turnTo(0);
			}else{ahead(80);
			turnGunLeft(45); 
			turnGunRight(360); }


			}
			
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {
	
	turnGunTo(scannedAngle);
	fire(2);

	}


	public void onHitByBullet() {
	turnTo(hitByBulletBearing);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like
		turnBackLeft(50,28);
		turnAheadRight(10,45);
	}	
}
