package A23HX2PROG;
import robocode.*;

import robocode.HitRobotEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;

import java.awt.*;

public class Brokencrazy extends Robot
{
	boolean peek;
	double moveAmount;
	
	public void run() {
		setBodyColor(Color.black);
		setGunColor(Color.black);
		setRadarColor(Color.black);
		setBulletColor(Color.black);
		setScanColor(Color.black);

		moveAmount = Math.max(getBattleFieldWidth(), getBattleFieldHeight());
		peek = false;
		
		turnLeft(getHeading() % 90);
		ahead(moveAmount);
		peek = true;
		turnGunRight(90);
		turnRight(90);

		while(true) {
			peek = true;
			ahead(moveAmount);
			peek = false;		
			turnRight(90);	

		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onHitRobot(HitRobotEvent e) {
	if (e.getBearing() > -90 && e.getBearing() < 90) {
			back(100);
		}
		else {
			ahead(100);
		}
	}


	public void onScannedRobot(ScannedRobotEvent e) {
	fire(2);
		if (peek) {
			scan();
		}
	}	
}
