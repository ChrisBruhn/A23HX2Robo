package A23HX2PROG;
import robocode.*;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html

/**
 * Test2 - a robot by (your name here)
 */
public class Test2 extends JuniorRobot{

private boolean hitWall = false;

    public void run() {
        while (true) {
            moveTowardsWall();
            followWall();
            turnAndFire();
            // Note: No need to call scan() here
        }
    }

    private void moveTowardsWall() {
        // Move towards the wall
        ahead(100);
    }

    private void followWall() {
        // Follow the wall by turning right
        turnRight(90);
    }

    private void turnAndFire() {
        if (hitWall) {
            // If hit wall, go back
            back(50);
            hitWall = false;
        } else {
            // Otherwise, turn and fire towards the middle of the square
            turnGunRight(180);
            fire(3);
        }
    }

    // Use the onScannedRobot event for scanning
    public void onScannedRobot(ScannedRobotEvent event) {
        // When an enemy is scanned, reverse direction
        hitWall = true;
    }

    public void onHitWall() {
        // Update the hitWall flag when the robot hits a wall
        hitWall = true;
    }
}