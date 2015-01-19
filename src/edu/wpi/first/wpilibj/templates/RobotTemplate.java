package org.usfirst.frc.team4553.robot;

import edu.wpi.first.wpilibj.Joystick;            // Joystick module
import edu.wpi.first.wpilibj.SampleRobot;         // Basic Program Hierarchy
import edu.wpi.first.wpilibj.RobotDrive;          // Driving class        

public class Robot extends SampleRobot {
    Joystick mainStick = new Joystick(0);         // declaring Joystick
    RobotDrive chassis = new RobotDrive(0,1,2,3); // declaring chassis as drive object
    
    
   public void autonomous() {
   }
        

 
    public void operatorControl() {
    	chassis.setSafetyEnabled(true);                 // If motors do not receive a signal continuously they shut off
        while (isOperatorControl() && isEnabled()) {    // operatorControl while loop
        	chassis.arcadeDrive(mainStick);             // arcadeDrive method 
        	
        }
    }
    
}
