/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author Developer
 */
public class Catapult extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public static Catapult instance;
    //Relay catapultRelay;
    Solenoid catapultForward;
    Solenoid catapultReverse;
    
    public static Catapult getInstance()
    {
        if (instance == null)
            instance = new Catapult();
        
        return instance;
    }
    
    private Catapult()
    {
        /*catapultRelay = new Relay(RobotMap.catapultRelay,
                                    Relay.Direction.kBoth);*/
        catapultForward = new Solenoid(RobotMap.catapultForward);
        catapultReverse = new Solenoid(RobotMap.cataputReverse);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void fire()
    {
        catapultReverse.set(false);
        catapultForward.set(true);
    }
    
    public void retract()
    {
        catapultForward.set(false);
        catapultReverse.set(true);
    }
    
    public boolean isSet()
    {
        if (catapultReverse.get())
            return true;
                    
        return false;
    }
}
