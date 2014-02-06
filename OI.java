
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.templates.commands.*;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

public class OI {
    
    Joystick controller = new Joystick(1);
    Button btnOne = new JoystickButton(controller, 1);
    Button btnTwo = new JoystickButton(controller, 2);
    
    public OI()
    {
        btnOne.whenPressed(new FireCatapult());
    }
    
    //the joysticks are inverted
    public double leftStickY()
    {
        if (controller.getY() < 0.1 && controller.getY() > -0.1)
        {
            return 0.0;
        }
            
        return controller.getY();
    }
    
    public double leftStickX()
    {
        if (controller.getX() < 0.1 && controller.getX() > -0.1)
        {
            return 0.0;
        }
        
        return controller.getX();
    }
    
    public double rightStickY()
    {
        return controller.getRawAxis(4);
    }
     
    public double rightStickX()
    {
        if (controller.getRawAxis(3) < 0.1 && controller.getRawAxis(3) > -0.1)
        {
            return 0.0;
        }
        
        return controller.getRawAxis(3);
    }
}

