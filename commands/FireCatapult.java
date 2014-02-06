/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.Timer;

/**
 *
 * @author Developer
 */
public class FireCatapult extends CommandBase {
    
    private Timer fireTimer = new Timer();
    
    public FireCatapult() {
        super("FireCatapult");
        requires(catapult);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        catapult.retract();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        catapult.fire();
        fireTimer.delay(0.6);
        catapult.retract();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() 
    {
        if (catapult.isSet())
        {
            return true;
        }
        
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}