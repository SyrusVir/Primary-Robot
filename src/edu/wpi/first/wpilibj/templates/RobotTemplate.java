package org.usfirst.frc.team4553.robot;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Gyro;

public class Robot extends SampleRobot {
	RobotDrive chassis = new RobotDrive(0, 1);
    Joystick mainStick = new Joystick(1);
    Gyro gyro = new Gyro(1);

 
   public void autonomous() {
	   
   }
        

 
    public void operatorControl() {
        chassis.setSafetyEnabled(true);
        while (isOperatorControl() && isEnabled()) {
            chassis.mecanumDrive_Cartesian(mainStick.getY(), -1 * mainStick.getX(), mainStick.getThrottle(), gyro.getAngle());
            
            Timer.delay(0.005);	// wait 5ms to avoid hogging CPU cycles
        }
    }
    
}
