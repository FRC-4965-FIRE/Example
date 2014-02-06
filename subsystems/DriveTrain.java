/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.templates.commands.JoystickDrive;


/**
 *
 * @author Student
 */
public class DriveTrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public static DriveTrain instance;
    RobotDrive drive;

    public static DriveTrain getInstance()
    {
        if (instance == null)
            instance = new DriveTrain();
        
        return instance;
    }
    
    private DriveTrain() {
        drive = new RobotDrive(new Jaguar(RobotMap.leftFront), new Jaguar(RobotMap.leftRear),
                                     new Jaguar(RobotMap.rightFront), new Jaguar(RobotMap.rightRear));
        
        drive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        drive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
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
    
    public void mecDrive(double x, double y, double rot)
    {
        drive.mecanumDrive_Cartesian(x, y, rot, 0.0);
    }
}
