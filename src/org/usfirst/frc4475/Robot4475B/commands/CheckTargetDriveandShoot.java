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
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class CheckTargetDriveandShoot extends CommandGroup {
    
    public  CheckTargetDriveandShoot() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
       // double blobs = SmartDashboard.getNumber("BLOB_COUNT");
        //SmartDashboard.putNumber("test blob count3", blobs);
        //if (blobs < 2.0) {
            addSequential(new DriveToLeftAndPrepareShot());
            addSequential(new ShortDelay());
            addSequential(new TossBall3QPower());
            addSequential(new TossBallResetPosition());
            
      //  }
      //  else
      //  {
      //      addSequential(new DriveToRightAndPrepareShot());
      //      addSequential(new ShortDelay());
      //      addSequential(new TossBall3QPower());
      //      addSequential(new TossBallResetPosition());
      //  } 
    
 /*       
        addParallel(new DriveToDistance(-7500));
        addSequential(new LowerArmsPrepareShot());
       // addSequential(new DriveForward());
        addSequential(new ShortDelay());
        addSequential(new TossBall3QPower());
        }
        else{
        addSequential(new DriveTurn(-.3,.5)); // Turn HalfPower for 1 Second
        addSequential(new DriveToDistance(-7500));
        addSequential(new LowerArmsPrepareShot());
       // addSequential(new DriveForward());
        addSequential(new ShortDelay());
        addSequential(new TossBall3QPower());
        }
*/         
    }

    
}
