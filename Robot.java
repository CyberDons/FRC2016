//---------Real___Robo----------\\

package org.usfirst.frc.team3133.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class Robot extends IterativeRobot {
	
	@Override
	public void robotInit() {
	//4 separate motors, spin independently
	//forward: front wheels turn inward, back wheels turn outward
	//backward: front wheels turn outward, back wheels turn inward
	//left: left wheels turn inward, right turn outward
	//right: left wheels turn outward, right turn inward
	//for any direction, take the direction of travel and make it the front. DUH!
	//rotate right/left: all wheels turn same direction
	//diagonal: move corners in same direction
		
	}

	@Override
	public void autonomousInit() {

	}

	@Override
	public void autonomousPeriodic() {
		
	}
	
	@Override
	public void teleopPeriodic() {
	}

	@Override
	public void testPeriodic() {
	}
}
