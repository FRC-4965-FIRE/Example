/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.JoystickDrive;


/**
 *
 * @author Student
 */
public class DriveTrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    RobotDrive drive;

    public DriveTrain() {
        this.drive = new RobotDrive(RobotMap.leftFront, RobotMap.leftRear,
                                     RobotMap.rightFront, RobotMap.rightRear);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new JoystickDrive());
    }
    
    public void drive(double leftSpeed, double rightSpeed)
    {
       drive.tankDrive(leftSpeed, rightSpeed);
    }
}
