
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.AxisType;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

public class OI {
    
    Joystick controller = new Joystick(1);
    
    public double leftStick()
    {
        return controller.getAxis(AxisType.kY);
    }
    
     public double rightStick()
    {
        return controller.getAxis(AxisType.kY);
    }
}

