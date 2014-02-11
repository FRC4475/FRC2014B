// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc4475.Robot4475B.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4475.Robot4475B.Robot;
/**
 *
 */
public class  TossBallSlowReset extends Command {
    public TossBallSlowReset() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.ballToss);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    // Called just before this Command runs the first time
    protected void initialize() {
        execute();
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
         if (Robot.ballToss.getBallTossPosition()>1)
            Robot.ballToss.ballTossPower(.3);
        else
            Robot.ballToss.ballTossPower(.2);
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (Robot.ballToss.getBallTossPosition()<.45);
    }
    // Called once after isFinished returns true
    protected void end() {
        Robot.ballToss.ballTossPower(0);
    }
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
